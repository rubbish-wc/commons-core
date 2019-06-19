package com.pubud.commons.exception;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 11:50
 * @Version 1.0
 */
public interface IBaseException {

    /**
     * 获取异常码
     * @return
     */
    String getCode();

    /**
     * 获取描述key
     * @return
     */
    String getDescriptionKey();

    /**
     * 获取参数列表
     * @return
     */
    Object[] getParameters();

    /**
     * 设置异常码
     * @param var1
     */
    void setCode(String var1);

    /**
     * 设置描述key
     * @param var1
     */
    void setDescriptionKey(String var1);

    /**
     * 设置参数
     * @param var1
     */
    void setParameters(Object[] var1);
}
