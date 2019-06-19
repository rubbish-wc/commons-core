package com.pubud.commons.constants;

import java.util.regex.Pattern;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 10:56
 * @Version 1.0
 */
public interface IBaseConstants {

    String VIEW_REDIRECT = "redirect:";
    String YES = "Y";
    String NO = "N";
    String SYSTEM_MAX_DATE = "9999/12/31 23:59:59";
    String SYSTEM_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
    String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    String DATE_FORMAT = "yyyy-MM-dd";
    String CACHE_RESOURCE_URL = "resource_url";
    String CACHE_RESOURCE_ID = "resource_id";
    String CACHE_ROLE_CODE = "role";
    String CACHE_OAUTH_CLIENT = "oauth_client";
    String CACHE_PROMPT = "prompt";
    String CACHE_CODE = "code";
    String CACHE_FUNCTION = "function";
    String CACHE_DATA_PERMISSION_RULE = "data_permission_rule";
    String OPTIONS_DTO = "dto";
    String OPTIONS_CRITERIA = "criteria";
    String ROLE_RESOURCE_CACHE = "role_resource";
    String DEFAULT_LANG = "zh_CN";
    String PREFERENCE_TIME_ZONE = "timeZone";
    String PREFERENCE_LOCALE = "locale";
    String PREFERENCE_THEME = "theme";
    String GENERATOR_TYPE = "IDENTITY";
    String LIKE = "LIKE";
    String XML_DATA_TYPE_FUNCTION = "fn:";
    String XML_DATA_TYPE_BOOLEAN = "boolean:";
    String XML_DATA_TYPE_INTEGER = "integer:";
    String XML_DATA_TYPE_LONG = "long:";
    String XML_DATA_TYPE_FLOAT = "float:";
    String XML_DATA_TYPE_DOUBLE = "double:";
    String XML_DATA_TYPE_DATE = "date:";
    String PLACEHOLDER_LOCALE = "#{request.locale,jdbcType=VARCHAR,javaType=java.lang.String}";
    String FORWARD_SLASH = "/";
    Pattern PATTERN_PHONE_REGEX = Pattern.compile("^1[3|4|5|8][0-9]\\d{4,8}");
    Pattern PATTERN_EMAIL_REGEX = Pattern.compile("^([\\s\\S]*)+@([\\S\\s]*)+(\\.([\\S\\s]*)+)+$");
    Pattern UESR_NAME_REGEX = Pattern.compile("^[A-Za-z0-9]{6,20}$");
    String UNDER_LINE = "_";
}
