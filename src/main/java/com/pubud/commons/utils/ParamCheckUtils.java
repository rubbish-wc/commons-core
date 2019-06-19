package com.pubud.commons.utils;

import java.util.List;

/**
 * 参数校验工具类
 * @author wangbaoliang
 */
public class ParamCheckUtils {

    /**
     * 字符串为空
     * @param string
     * @return
     */
    public static boolean isEmpty(String string){
        if ("".equals(string) || string == null){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 动态数组为空
     * @param list
     * @return
     */
    public static boolean isEmpty(List list){
        if (list == null || list.isEmpty()){
            return true;
        }else {
            return false;
        }
    }




}
