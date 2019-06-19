package com.pubud.commons.result;

import com.pubud.commons.exception.ExceptionInfo;

import java.io.Serializable;

/**
 * web层对象的封装
 * @param <T>
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -8357245559316888318L;

    /**
     * 相应状态标志
     */
    private boolean isSuccess;

    /**
     * 响应实体
     */
    private T model;

    /**
     * 异常信息
     */
    private ExceptionInfo exceptionInfo;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public ExceptionInfo getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(ExceptionInfo exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }
}
