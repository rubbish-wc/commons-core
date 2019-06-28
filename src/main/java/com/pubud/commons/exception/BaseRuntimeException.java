package com.pubud.commons.exception;

/**
 * @Description 基础运行时异常
 * @Author: charleyZZZZ
 * @Date: 2019/6/27 15:54
 * @Version 1.0
 */
public class BaseRuntimeException extends BaseException{

    protected BaseRuntimeException(String code, String descriptionKey, Object[] parameters) {
        super(code, descriptionKey, parameters);
    }

    public BaseRuntimeException(String code) {
        super(code, code, null);
    }

    public BaseRuntimeException(String code, String descriptionKey) {
        super(code, descriptionKey, null);
    }

    public BaseRuntimeException(String code, Object[] parameters) {
        super(code, code, parameters);
    }
}
