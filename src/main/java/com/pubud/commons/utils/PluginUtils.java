package com.pubud.commons.utils;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.lang.reflect.Proxy;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 19:58
 * @Version 1.0
 */
public class PluginUtils {

        private PluginUtils() {} // private constructor


        public static Object processTarget(Object target) {
            if(Proxy.isProxyClass(target.getClass())) {
                MetaObject mo = SystemMetaObject.forObject(target);
                return processTarget(mo.getValue("h.target"));
            }
            return target;
        }

}
