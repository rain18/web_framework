package org.zrain.web_framework.helper;

import org.zrain.web_framework.annotation.Controller;
import org.zrain.web_framework.annotation.Service;
import org.zrain.web_framework.utils.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Idan on 2018/1/6.
 */
public class ClassHelper {
    private static final Set<Class<?>> CLASS_SET;

    static {
        String backPackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(backPackage);
    }

    /**
     * 获得包名下所有的类
     * @return
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * 获得包名下所有的service类
     * @return
     */
    public static Set<Class<?>> getServiceClassSet() {
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> cls: CLASS_SET) {
            if (cls.isAnnotationPresent(Service.class)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获得包名下所有的Controller
     * @return
     */
    public static Set<Class<?>> getControllerClassSet() {
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> cls: CLASS_SET) {
            if (cls.isAnnotationPresent(Controller.class)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获得包名下所有的bean类
     * @return
     */
    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> classSet = new HashSet<>();
        classSet.addAll(getServiceClassSet());
        classSet.addAll(getControllerClassSet());
        return classSet;
    }
}