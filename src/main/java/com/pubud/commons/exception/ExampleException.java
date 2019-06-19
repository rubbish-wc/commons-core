package com.pubud.commons.exception;

/**
 * @Description 示例异常
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 11:53
 * @Version 1.0
 */
public class ExampleException extends BaseException{

    protected ExampleException(String code, String descriptionKey, Object[] parameters) {
        super(code, descriptionKey, parameters);
    }

    public ExampleException(String code,String message) {
        this(code, message, (Object[])null);
    }
}
