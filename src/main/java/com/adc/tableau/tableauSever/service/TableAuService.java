package com.adc.tableau.tableauSever.service;

import com.adc.tableau.tableauSever.entity.*;
import com.adc.tableau.tableauSever.util.GetTrusted;
import com.adc.tableau.tableauSever.util.MongoTemplateUtils;
import com.adc.tableau.tableauSever.util.exception.AdcDaBaseException;
import com.adc.tableau.tableauSever.util.http.ResponseMessage;
import com.adc.tableau.tableauSever.util.http.Result;
import com.adc.tableau.tableauSever.util.tableau.RestApiUtil;
import com.adc.tableau.tableauSever.util.tableau.SdkUtil;
import com.adc.tableau.tableauSever.vo.LoadVO;
import com.adc.tableau.tableauSever.vo.PageVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.SocketException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 连接tableauService
 */
@Service
public class TableAuService {

    /**
     * 日志记录
     */
    private static Logger logger = LoggerFactory.getLogger(TableAuService.class);

    @Autowired
    TableauConfigType tableauConfigType;
    @Autowired
    MongoTemplateUtils mongoTemplate;

    /**
     * 传递票证地址
     *
     * @param workName 工作薄名称
     * @param viewName 视图名称
     * @return
     */
    public ResponseMessage getViewUrl(String workName, String viewName) {
        try {
            String tableServer = tableauConfigType.getServer();
            String ticket = GetTrusted.getTrustedTicket(tableServer, tableauConfigType.getUserName(), tableauConfigType.getIpv4());
            logger.info("票证获取成功");
            final String viewUrl = "views/" + workName + "/" + viewName;
            final String params = ":embed=yes&:toolbar=no";
            if (ticket != null && !"-1".equals(ticket)) {
                return Result.success("http://" + tableServer + "/trusted/" + ticket + "/" + viewUrl + "?" + params);
            } else {
                throw new AdcDaBaseException("无法获取tableau服务器票据，请联系管理员！");
            }
        } catch (Exception e) {
            throw new AdcDaBaseException("无法连接tableau，请联系管理员！");
        }
    }

    /**
     * 分页展示数据源
     */
    public List<DatasourceType> showDataSourcePage(String projectName/*, PageVO pageVO*/) {
        TableauCredentialsType credentialsType = RestApiUtil.login();

        TsResponse tsResponse = RestApiUtil.showDataSource(credentialsType);
        DataSourceListType datasources = tsResponse.getDatasources();
        List<DatasourceType> dataSource = datasources.getDataSource();
        if(dataSource.size()==1){
            return dataSource;
        }
        return dataSource.stream().filter(eo -> eo.getProject().getName().equals(projectName)).sorted((eo, eo1) -> {
            if (eo.getCreatedAt().getTime() > eo1.getCreatedAt().getTime()
                    || eo.getUpdatedAt().getTime() > eo1.getUpdatedAt().getTime()
            ) {
                return -1;
            } else if (eo.getCreatedAt().getTime() == eo1.getCreatedAt().getTime()
                    || eo.getUpdatedAt().getTime() > eo1.getUpdatedAt().getTime()) {
                return 0;
            } else {
                return -1;
            }
        }).collect(Collectors.toList());
    }


    public ResponseMessage returnDataSourceUrl(String contentUrl) {
        String tableServer = tableauConfigType.getServer();
        String ticket = GetTrusted.getTrustedTicket(tableServer, tableauConfigType.getUserName(), tableauConfigType.getIpv4());
        logger.info("票证获取成功");
        int i = contentUrl.indexOf("#");
        if (i == -1) {
            throw new AdcDaBaseException("请求地址错误");
        }
        String url = contentUrl.substring(0, i) + "trusted/" + ticket +"/#"+ contentUrl.substring(i + 2);
        return Result.success(url);
    }

    /**
     * 上传分三步步：一是先删除，二是生成数据源文件，3是上传数据源文件
     */
    public void loadPutData(LoadVO loadVO){
        //删除数据源：
        RestApiUtil.delDataSource(RestApiUtil.login(),loadVO.getProjectName(),loadVO.getDataSourceName());
        int limit =200000;
        Long count = mongoTemplate.countByCollectionName(loadVO.getTableName());
        String dataSourceAddress = null;
        //becomeFile
        if(count >limit){
            long loop = count / limit;
            for (int i = 0; i < loop; i++) {
                 dataSourceAddress = SdkUtil.createFile(loadVO.getTableName(), loadVO.getFieldMsg(),
                        loadVO.getFieldNames(),
                        loadVO.getDataSourceName(),
                        mongoTemplate.findAll(loadVO.getTableName(),i, (int) (200000*loop)),false);
            }

        }else{
             dataSourceAddress = SdkUtil.createFile(loadVO.getTableName(), loadVO.getFieldMsg(),
                    loadVO.getFieldNames(),
                    loadVO.getDataSourceName(),
                    mongoTemplate.findAll(loadVO.getTableName(),0,200000),true);
        }

        //上传
        RestApiUtil.publishDataSource( RestApiUtil.login(),loadVO.getProjectName(), dataSourceAddress,loadVO.getDataSourceName());
    }


}
