package com.pubud.commons.exception;

/**
 * @Description 基础业务异常
 * @Author: charleyZZZZ
 * @Date: 2019/6/27 15:52
 * @Version 1.0
 */
public class BaseBizException extends BaseException{

    protected BaseBizException(String code, String descriptionKey, Object[] parameters) {
        super(code, descriptionKey, parameters);
    }

    public BaseBizException(String code) {
        super(code, code, null);
    }

    public BaseBizException(String code, String descriptionKey) {
        super(code, descriptionKey, null);
    }

    public BaseBizException(String code, Object[] parameters) {
        super(code, code, parameters);
    }
}
