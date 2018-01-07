package org.zrain.web_framework.helper;



import org.zrain.web_framework.annotation.Inject;
import org.zrain.web_framework.utils.ArrayUtil;
import org.zrain.web_framework.utils.CollectionUtil;
import org.zrain.web_framework.utils.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by Idan on 2018/1/7.
 * 依赖注入
 */
public class IocHelper {

    /**
     * 先拿到所有Bean的map，
     * 遍历map，判断每个key中是否有注解，
     * 如果有注解，判断类型，利用反射，将实体Bean执行set操作
     */
    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry:beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFields = beanClass.getFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    for (Field beanField: beanFields) {
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }

}
