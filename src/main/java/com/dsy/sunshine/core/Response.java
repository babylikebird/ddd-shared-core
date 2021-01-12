package com.dsy.sunshine.core;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-19 9:40
 */
public class Response extends DTO {

    private static final long serialVersionUID = 1L;

    public static final int DEFAULT_SUCCESS_CODE = 200;

    public static final String DEFAULT_SUCCESS_MESSAGE = "操作成功";

    private boolean isSuccess;

    private int code = DEFAULT_SUCCESS_CODE;

    private String msg = DEFAULT_SUCCESS_MESSAGE;

    public Response() {

    }

    public static Response buildFailure(int errCode, String errMessage) {
        Response response = new Response();
        response.setSuccess(false);
        response.setCode(errCode);
        response.setMsg(errMessage);
        return response;
    }

    public static Response buildSuccess(){
        Response response = new Response();
        response.setSuccess(true);
        return response;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
