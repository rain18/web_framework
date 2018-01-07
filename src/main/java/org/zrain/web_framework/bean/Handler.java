package org.zrain.web_framework.bean;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * Created by Idan on 2018/1/7.
 */
@Data
public class Handler {

    /**
     * Controller 类
     */
    private Class<?> controllerClass;

    /**
     * Actioin 方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }
}
