package org.zrain.web_framework.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Idan on 2018/1/6.
 * 反射工具类
 */
public class ReflectionUtil {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * 创建实例
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls) {
        Object obj;
        try {
            obj = cls.newInstance();
        } catch (Exception e) {
            logger.error("new instance fail", e);
            throw new RuntimeException(e);
        }
        return obj;
    }

    /**
     * 根据实例和方法，参数值，经过反射拿到结果值
     * Object... 不确定参数类型和个数，多态的表现
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invokeMethod(Object obj, Method method, Object... args) {
        Object result;
        try {
            method.setAccessible(true);
            result = method.invoke(obj, args);
        } catch (Exception e) {
            logger.error("invoke method fail", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * 设置变量的值
     * @param obj
     * @param field
     * @param value
     */
    public static void setField(Object obj, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            logger.error("set field fail", e);
            throw new RuntimeException(e);
        }
    }
}
