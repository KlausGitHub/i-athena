package com.athena.common;

import com.athena.constants.IConstants;

import java.io.Serializable;

/**
 * Created by yangsheng on 2017/6/4.
 */
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = -1394760700980413415L;

    private static final String SUCCESS_CODE = "OK";

    private String result;
    private String msg = "";
    private T data;

    public BaseResult() {
    }

    public BaseResult(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public void setSuccessCode() {
        this.result = SUCCESS_CODE;
    }

    public void setSuccess(T data) {
        this.setSuccessCode();
        this.data = data;
    }

    public boolean success() {
        return result.equalsIgnoreCase(SUCCESS_CODE);
    }

    public boolean fail() {
        return !success();
    }

    public void setFail(String msg) {
        this.result = IConstants.FAIL;
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "BaseResult [result=" + this.result + ", msg=" + this.msg + ", data=" + this.data + "]";
    }
}
