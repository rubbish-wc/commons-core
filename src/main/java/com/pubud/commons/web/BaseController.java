package com.pubud.commons.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pubud.commons.constants.IBaseConstants;
import com.pubud.commons.dto.BaseResponseDTO;
import com.pubud.commons.exception.BaseException;
import com.pubud.commons.exception.IBaseException;
import org.apache.catalina.util.RequestUtil;
import org.apache.ibatis.ognl.OgnlException;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Description
 * @Author: charleyZZZZ
 * @Date: 2019/6/27 15:42
 * @Version 1.0
 */
public class BaseController implements IBaseConstants {


    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    protected static final String DEFAULT_PAGE = "1";
    protected static final String DEFAULT_PAGE_SIZE = "10";


    private static final String JSP_500 = "500";
    private static final String ERROR_MESSAGE = "errorMsg";


    /**
     * @param exception
     * @param request
     * @return java.lang.Object
     * <p>
     * Modification History
     * Date            Author           Description
     * ----------------------------------------------------
     * 2019/6/27     charleyZZZZ      create/modify
     * @Description: 异常捕捉处理
     */
    @ExceptionHandler(Exception.class)
    public Object exceptionHandler(Exception exception, HttpServletRequest request) {
        LOGGER.error(exception.getMessage(), exception);
        Throwable rootCause = this.getRootCause(exception);
        IBaseException baseException;
        if (!this.isAjaxRequest(request) && !this.isApiRequest(request) && !ServletFileUpload.isMultipartContent(request)) {
            ModelAndView modelAndView = new ModelAndView(JSP_500);
            if (rootCause instanceof IBaseException) {
                modelAndView.addObject(ERROR_MESSAGE, exception.getMessage());
            }
            return modelAndView;
        } else {
            BaseResponseDTO baseResponseDTO = new BaseResponseDTO(false);
            baseResponseDTO.setMessage(exception.getMessage());
            if (rootCause instanceof IBaseException) {
                baseException = (IBaseException) rootCause;
                baseResponseDTO.setCode(baseException.getCode());
            }
            return baseResponseDTO;
        }
    }


    /**
     * @param throwable
     * @return java.lang.Throwable
     * <p>
     * Modification History
     * Date            Author           Description
     * ----------------------------------------------------
     * 2019/6/27         charleyZZZZ      create/modify
     * @Description: 获取最里层异常
     */
    private Throwable getRootCause(Throwable throwable) {
        while (throwable.getCause() != null) {
            throwable = throwable.getCause();
        }
        if (throwable instanceof OgnlException && ((OgnlException) throwable).getReason() != null) {
            return this.getRootCause(((OgnlException) throwable).getReason());
        } else {
            return throwable;
        }
    }


    /**
     * @param request
     * @return boolean
     * <p>
     * Modification History
     * Date            Author           Description
     * ----------------------------------------------------
     * 2019/6/27         charleyZZZZ      create/modify
     * @Description: 判断是否是ajax请求
     */
    private boolean isAjaxRequest(HttpServletRequest request) {
        String xr = request.getHeader(X_REQUESTED_WIDTH);
        return xr != null && XML_HTTP_REQUEST.equalsIgnoreCase(xr);
    }


    /**
     * @param request
     * @return boolean
     * <p>
     * Modification History
     * Date            Author           Description
     * ----------------------------------------------------
     * 2019/6/27         charleyZZZZ      create/modify
     * @Description: 判断是否是api请求
     */
    private boolean isApiRequest(HttpServletRequest request) {
        return request.getRequestURI().contains(API_PREFIX);
    }


    /**
     * @Description: 获取异常堆栈信息
     * @param throwable
     * @return java.lang.String
     *
     * Modification History
     * Date            Author           Description
     * ----------------------------------------------------
     * 2019/6/28      charleyZZZZ      create/modify
     */
    protected String getStackTraceMessages(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try {
            throwable.printStackTrace(pw);
            return sw.toString();
        } finally {
            pw.close();
        }
    }
}
