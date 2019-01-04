package com.adc.tableau.tableauSever.util.http;

import com.adc.tableau.tableauSever.util.enums.CodeEnum;

/**
 * 快速生成消息体的方法
 * 可生成成功消息体或失败消息体两种
 *
 * @author lixuetao
 * date 2018-08-28
 **/
public class Result {

    /**
     * 成功响应码，为默认
     *
     * @author lixuetao
     * date 2018-08-28
     **/
    private static final ResponseMessage RESPONSE_MESSAGE_SUCCESS = new ResponseMessage(CodeEnum.SUCCESS.getCode(),
            "",
            true,
            null);

    /**
     * 成功方法，返回成功响应码
     *
     * @author lixuetao
     * date 2018-08-28
     **/
    public static ResponseMessage success() {
        return RESPONSE_MESSAGE_SUCCESS;
    }

    /**
     * 成功方法，带参数和code字符串
     *
     * @param code 字符串
     * @param t    具体返回的数据
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static <T> ResponseMessage<T> success(String code, T t) {
        return new ResponseMessage(code, "", true, t);
    }

    /**
     * 成功方法，带参数和code码
     *
     * @param code 代表成功的code码类，包含code码和code消息
     * @param t    具体返回的数据
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static <T> ResponseMessage<T> success(CodeEnum code, T t) {
        return new ResponseMessage(code.getCode(), code.getMsg(), true, t);
    }

    /**
     * 成功方法，带参数和code码
     *
     * @param code    代表成功的code码字符串
     * @param message 代表成功的code消息
     * @param t       具体返回的数据
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static <T> ResponseMessage<T> success(String code, String message, T t) {
        return new ResponseMessage(code, message, true, t);
    }

    /**
     * 成功方法，带响应参数
     *
     * @param t 具体返回的数据
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static <T> ResponseMessage<T> success(T t) {
        return new ResponseMessage(CodeEnum.SUCCESS.getCode(), "", true, t);
    }

    /**
     * 错误响应方法
     *
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static ResponseMessage error() {
        return error("");
    }

    /**
     * 错误响应方法，带错误消息
     *
     * @param message 错误的消息字符串
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static ResponseMessage error(String message) {
        return error(CodeEnum.ERROR.getCode(), message);
    }

    /**
     * 错误响应方法，带错误code
     *
     * @param code 错误的消息code，带code码和code消息
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static ResponseMessage error(CodeEnum code) {
        return error(code.getCode(), code.getMsg(), null);
    }

    /**
     * 错误响应方法，带错误code和响应参数
     *
     * @param code 错误的消息code，带code码和code消息
     * @param t 响应参数
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static <T> ResponseMessage<T> error(CodeEnum code, T t) {
        return error(code.getCode(), code.getMsg(), t);
    }

    /**
     * 错误响应方法，带错误code
     *
     * @param code 错误的消息code码
     * @param message 错误的消息code消息
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static ResponseMessage error(String code, String message) {
        return error(code, message, null);
    }

    /**
     * 错误响应方法，带错误code和响应参数
     *
     * @param code 错误的消息code，带code码和code消息
     * @param t 响应参数
     * @return 通用的响应消息头
     * @author lixuetao
     * date 2018-08-28
     **/
    public static <T> ResponseMessage<T> error(String code, String message, T t) {
        return new ResponseMessage(code, message, false, t);
    }

}
