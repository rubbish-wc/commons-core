package com.pubud.commons.result;

import com.pubud.commons.exception.ExceptionInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回结果封装
 * @author wangbaoliang
 */
@Data
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 4093867238604830247L;

    /**
     * 查询结果
     */
    private List<T> model;

    /**
     * 总条数
     */
    private int totalCount;

    /**
     * 业务结果
     */
    private boolean isSuccess;

    /**
     * 异常信息
     */
    private ExceptionInfo exceptionInfo;
}
