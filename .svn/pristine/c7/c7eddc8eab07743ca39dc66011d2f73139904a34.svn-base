package com.adc.tableau.tableauSever.vo;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

/**
 * 上传数据源的接口调用参数类
 */
@Validated
public class LoadVO {
    @NotBlank(message = "项目名称，不能为空！")
    private String projectName;
    @NotBlank(message = "数据源名称，不能为空！")
    private String dataSourceName;
    @NotBlank(message = "表名，不能为空！")
    private String tableName;
    private Map<String, Integer> fieldMsg;
    private Map<String, String> fieldNames;

    public Map<String, Integer> getFieldMsg() {
        return fieldMsg;
    }

    public void setFieldMsg(Map<String, Integer> fieldMsg) {
        this.fieldMsg = fieldMsg;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map<String, String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(Map<String, String> fieldNames) {
        this.fieldNames = fieldNames;
    }

}
