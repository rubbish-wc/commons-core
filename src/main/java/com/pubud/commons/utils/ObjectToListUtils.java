package com.pubud.commons.utils;

import tk.mybatis.mapper.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 15:41
 * @Version 1.0
 */
public class ObjectToListUtils {

    /**
     * 将一个对象转换成对象集合
     *
     * @param t
     * @return
     */
    public static <T> List<T> getListByObject(T t) {
        Assert.isNull(t,"Object is not allow null...");
        List<T> list = new ArrayList<>(1);
        list.add(t);
        return list;
    }
}
