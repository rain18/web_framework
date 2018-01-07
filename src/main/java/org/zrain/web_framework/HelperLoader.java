package org.zrain.web_framework;

import org.zrain.web_framework.helper.BeanHelper;
import org.zrain.web_framework.helper.ClassHelper;
import org.zrain.web_framework.helper.ControllerHelper;
import org.zrain.web_framework.helper.IocHelper;
import org.zrain.web_framework.utils.ClassUtil;

/**
 * Created by Idan on 2018/1/7.
 * load the class
 */
public class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls:classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }

}
