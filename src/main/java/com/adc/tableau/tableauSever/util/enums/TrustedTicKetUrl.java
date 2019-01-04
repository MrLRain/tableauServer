package com.adc.tableau.tableauSever.util.enums;

import com.adc.tableau.tableauSever.util.exception.AdcDaBaseException;

/**
 * 获取票证想访问的地址
 * 本次只提供：
 * 链接数据源和视图的选项，以后有需求可以自行添加
 */
public enum TrustedTicKetUrl {

    DATA_SOURCE,WORK_BOOK;

    TrustedTicKetUrl() {

    }

    public static String becomeUrl(String severIP, String trusted, TrustedTicKetUrl trustedTicKet){
    StringBuilder sb =new StringBuilder("http://");
        switch (trustedTicKet) {
            case DATA_SOURCE:
                return sb.append(severIP).append("trusted").append(trusted).append("/#datasources").toString();
            case WORK_BOOK:
                return sb.append(severIP).append("trusted").append(trusted).append("/#datasources").toString();
                default:
                    return null;
        }
    }


}


