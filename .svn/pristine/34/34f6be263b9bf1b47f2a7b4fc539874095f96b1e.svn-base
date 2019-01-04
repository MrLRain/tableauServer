package com.adc.tableau.tableauSever.util.http;


import java.io.Serializable;

/**  
 * 响应对象
 * 
 * @author lixuetao  
 * date 2018-08-28  
 **/ 
public class ResponseMessage<T> implements Serializable {

    private static final long serialVersionUID = 2999784516561316773L;

    /**  
     * 响应码
     **/
    private String respCode;

    /**
     * 响应消息
     */
    private String respMsg;

    /**
     * 响应数据，为泛型
     */
    private T data;

    /**
     * 是否执行成功:success(成功), false（失败）
     */
    private boolean ok;

    public ResponseMessage() {
    }

    public ResponseMessage(String respCode, String message) {
        this.respCode = respCode;
        this.respMsg = message;
    }

    public ResponseMessage(String respCode, String message, boolean ok, T data) {
        this.respCode = respCode;
        this.respMsg = message;
        this.ok = ok;
        this.data = data;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getMessage() {
        return respMsg;
    }

    public void setMessage(String message) {
        this.respMsg = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    @Override
    public String toString() {
        return "{" + "\"ok\":"
                + isOk()
                + ",\"code\":"
                + '"' + getRespCode()
                + '"' + ",\"message\":"
                + '"' + getMessage()
                + '"' + "\\}";
    }
}
