package com.pubud.commons.exception;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 11:50
 * @Version 1.0
 */
public interface IBaseException {

    String getCode();

    String getDescriptionKey();

    Object[] getParameters();

    void setCode(String var1);

    void setDescriptionKey(String var1);

    void setParameters(Object[] var1);
}
