package com.adc.tableau.tableauSever.util.enums;

/**
 *获取 视图可嵌入的选择
 */
public enum TicketViewEnum {
    //显示必需的 URL 参数。隐藏顶部导航区域，使视图更好地混合到网页中。
    EMBED(":embed=yes"),
    //如果未设置此参数，默认情况下显示工具栏。当选择 no 时，工具栏将从嵌入视图中排除。当选择 top 时，工具栏将置于视图之上。
    TOOLBAR(":toolbar=no");

    private  String value;

    TicketViewEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }}
