package com.dsy.shared.core;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-19 9:41
 */
public class ResponseWithData<T> extends Response {

    private static final long serialVersionUID = 1L;
    private T data;

    public ResponseWithData() {
        super();
    }

    public static <T> ResponseWithData<T> of(T data) {
        ResponseWithData<T> singleResponse = new ResponseWithData<>();
        singleResponse.setSuccess(true);
        singleResponse.setData(data);
        return singleResponse;
    }

    public T getData() {
        return data;
    }

    public ResponseWithData<T> setData(T data) {
        this.data = data;
        return this;
    }

    @SuppressWarnings("rawtypes")
    public static ResponseWithData buildFailure(int errCode, String errMessage) {
        ResponseWithData response = new ResponseWithData();
        response.setSuccess(false);
        response.setCode(errCode);
        response.setMsg(errMessage);
        return response;
    }
    @SuppressWarnings("rawtypes")
    public static ResponseWithData buildSuccess(){
        ResponseWithData response = new ResponseWithData();
        response.setSuccess(true);
        return response;
    }
}
