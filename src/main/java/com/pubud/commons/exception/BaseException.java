package com.pubud.commons.exception;

import java.io.Serializable;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 11:39
 * @Version 1.0
 */
public class BaseException extends Exception implements Serializable,IBaseException {
    private static final long serialVersionUID = -3139953521399947760L;

    private String code;
    private String descriptionKey;
    private Object[] parameters;

    protected BaseException(String code, String descriptionKey, Object[] parameters) {
        super(descriptionKey);
        this.code = code;
        this.descriptionKey = descriptionKey;
        this.parameters = parameters;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescriptionKey() {
        return this.descriptionKey;
    }

    @Override
    public Object[] getParameters() {
        return this.parameters;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setDescriptionKey(String descriptionKey) {
        this.descriptionKey = descriptionKey;
    }

    @Override
    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
