package org.zrain.web_framework.utils;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;

/**
 * Created by Idan on 2018/1/7.
 */
public class ArrayUtil {

    public static Boolean isNotEmpty(Object[] array) {
        return !ArrayUtil.isEmpty(array);
    }

    public static Boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
