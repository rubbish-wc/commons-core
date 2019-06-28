package com.pubud.commons.exception;

import java.io.Serializable;

/**
 * @Description 异常定义规范：
 * 其他基础异常继承自 该异常：业务异常（BaseBizException）、运行时异常（BaseRuntimeException）、其他异常
 * 定义不同类别异常代码格式：例如：01-   、02-  、 03-
 * 子类复写不同参数构造器
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
