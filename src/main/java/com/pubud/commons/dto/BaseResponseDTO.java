package com.pubud.commons.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.Page;
import com.pubud.commons.utils.ObjectToListUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 11:24
 * @Version 1.0
 */
public class BaseResponseDTO<T> implements Serializable {

    private static final long serialVersionUID = -3499108400278188286L;

    private static final String HTTP_RETURN_SUCCESS_CODE = "200";
    private static final String HTTP_RETURN_SUCCESS_MESSAGE = "success";

    private static final String ERROR_CODE = "50000";
    private static final String UN_AUTHENTICATED = "40101";



    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<?> rows;
    private boolean success;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long total;

    /**
     * 默认构造器，默认成功
     */
    public BaseResponseDTO() {
        this.success = true;
        this.code = HTTP_RETURN_SUCCESS_CODE;
        this.message = HTTP_RETURN_SUCCESS_MESSAGE;
    }

    /**
     * 传入object,默认构造器
     * @param t
     */
    public BaseResponseDTO(T t){
        List<T> listByObject = ObjectToListUtils.getListByObject(t);
        this.success = true;
        this.code = HTTP_RETURN_SUCCESS_CODE;
        this.message = HTTP_RETURN_SUCCESS_MESSAGE;
        this.setRows(listByObject);
    }

    /**
     * 传入list，默认构造器
     * @param list
     */
    public BaseResponseDTO(List<?> list) {
        this.success = true;
        this.code = HTTP_RETURN_SUCCESS_CODE;
        this.message = HTTP_RETURN_SUCCESS_MESSAGE;
        this.setRows(list);
    }




    /**
     * 返回错误
     * @param code
     * @param msg
     * @return
     */
    public static BaseResponseDTO error(String code,String msg){
        BaseResponseDTO responseDTO = new BaseResponseDTO();
        responseDTO.setSuccess(false);
        responseDTO.setCode(code);
        responseDTO.setMessage(msg);
        return responseDTO;
    }


    /**
     * 错误响应
     */
    public static BaseResponseDTO error() {
        return error(ERROR_CODE, "未知异常，请联系管理员");
    }

    /**
     * 未授权响应
     */
    public static BaseResponseDTO unAuthticated() {
        return error(UN_AUTHENTICATED, "访问拒绝,请进行登陆认证");
    }

    /**

    /**
     * 错误响应
     */
    public static BaseResponseDTO error(String msg) {
        return error(ERROR_CODE, msg);
    }


    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<?> getRows() {
        return this.rows;
    }

    public Long getTotal() {
        return this.total;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
        if (rows instanceof Page) {
            this.setTotal(((Page) rows).getTotal());
        } else {
            this.setTotal((long) rows.size());
        }

    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
