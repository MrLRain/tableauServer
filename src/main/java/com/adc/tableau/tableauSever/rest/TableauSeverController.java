package com.adc.tableau.tableauSever.rest;

import com.adc.tableau.tableauSever.entity.DatasourceType;
import com.adc.tableau.tableauSever.service.TableAuService;
import com.adc.tableau.tableauSever.util.exception.AdcDaBaseException;
import com.adc.tableau.tableauSever.util.http.ResponseMessage;
import com.adc.tableau.tableauSever.util.http.Result;
import com.adc.tableau.tableauSever.vo.LoadVO;
import com.adc.tableau.tableauSever.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tableau")
public class TableauSeverController {
    @Autowired
    private TableAuService tableAuService;

    /**
     * 组装数据源，并上传数据源
     * 本来打算传数据源连接过来的，但是最终由于项目的限制
     */
    @PostMapping("/")
    public void loadPutData(@Valid @RequestBody LoadVO loadVO) {
        tableAuService.loadPutData(loadVO);
    }

    /**
     * 获取数据源列表
     *
     * @param projectName 项目名称
     */
    @GetMapping("/pageDS")
    public ResponseMessage getDataSourceType(String projectName/*, PageVO pageVO*/) {
        return Result.success(tableAuService.showDataSourcePage(projectName/*, pageVO*/));
    }

    /**
     * tableAu 视图查看
     *
     * @param workName 工作薄的名称
     * @param viewName 视图名称
     * @return 该视图的地址
     */
    @GetMapping("/viewUrl")
    //todo 这个差能选择 url 带什么参数
    public ResponseMessage returnViewUrl(String workName, String viewName) {
        return tableAuService.getViewUrl(workName, viewName);
    }

    /***
     * 查看数据源详情页面
     * @param map  传 key contentUrl val
     */
    @PostMapping("/dataSUrl")
    public ResponseMessage returnDataSourceUrl(@RequestBody Map<String,String> map) {
        if(!map.containsKey("contentUrl")){
            throw new AdcDaBaseException("key 必须要有contentUrl");
        }
        return tableAuService.returnDataSourceUrl(map.get("contentUrl"));
    }

}
