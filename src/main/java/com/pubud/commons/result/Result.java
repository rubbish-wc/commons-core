package com.pubud.commons.result;

import com.pubud.commons.exception.ExceptionInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * web层对象的封装
 * @author wangbaolinag
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -8357245559316888318L;

    /**
     * 相应状态标志
     */
    private Boolean isSuccess;

    /**
     * 响应实体
     */
    private T model;

    /**
     * 异常信息
     */
    private ExceptionInfo exceptionInfo;

}
