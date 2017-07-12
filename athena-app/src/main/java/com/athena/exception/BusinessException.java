package com.athena.exception;

/**
 * Created by yangsheng on 2017/7/8.
 */
public class BusinessException extends RuntimeException {

    private String msg;

    public BusinessException(String msg){
        super(msg);
    }
}
