package com.adc.tableau.tableauSever.util.exception;


import com.adc.tableau.tableauSever.util.enums.CodeEnum;

/**
 * 异常
 */
public class AdcDaBaseException extends RuntimeException {

    private static final long serialVersionUID = -3785352450518033758L;

    /**
     * 错误编码
     */
    private String errorCode;

    public AdcDaBaseException() {
    }

    public AdcDaBaseException(String message) {
        this("-1", message);
    }

    public AdcDaBaseException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public AdcDaBaseException(CodeEnum codeEnum) {
        this(codeEnum.getCode(), codeEnum.getMsg());
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
