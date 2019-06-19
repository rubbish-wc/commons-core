package com.pubud.commons.dto;

import com.pubud.commons.constants.IBaseConstants;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 10:57
 * @Version 1.0
 */
public class BaseDTO implements Serializable, IBaseConstants {

    private static final long serialVersionUID = -1613338285067765940L;

    public static final String FIELD_OBJECT_VERSION_NUMBER = "objectVersionNumber";
    public static final String FIELD_CREATED_BY = "createdBy";
    public static final String FIELD_CREATION_DATE = "creationDate";
    public static final String FIELD_LAST_UPDATED_BY = "lastUpdatedBy";
    public static final String FIELD_LAST_UPDATE_DATE = "lastUpdateDate";


    /**
     * 版本号，乐观锁
     */
    @Column
    public Long objectVersionNumber;

    /**
     * 创建用户id
     */
    @Column
    public Long createdBy;

    /**
     * 创建日期
     */
    @Column
    public Date creationDate;

    /**
     * 最后更新日期
     */
    @Column
    public Date lastUpdateDate;

    /**
     * 最后更新人
     */
    @Column
    public Long lastUpdatedBy;


    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
