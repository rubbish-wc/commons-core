package com.pubud.commons.constants;

import com.pubud.commons.exception.ExceptionInfo;

/**
 * ExceptionInfo常亮类
 * @author wangbaolinag
 */
public class ExceptionConstants {

    public static final ExceptionInfo OK = new ExceptionInfo("OK","成功");

    /**
     * 静态方法构造系统异常
     * @param throwable
     * @return
     */
    public static ExceptionInfo genSystemError(Throwable throwable){
        return new ExceptionInfo("SYSTEM_ERROR",throwable.getMessage());
    }
}
