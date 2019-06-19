package com.pubud.commons.exception;

/**
 * 封装的业务异常对象
 * @author wangbaoliang
 */
public class ExceptionInfo {

    /**
     * 异常码
     */
    private String errorCode;

    /**
     * 异常信息
     */
    private String errorMessage;

    public ExceptionInfo(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
