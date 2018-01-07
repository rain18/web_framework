package org.zrain.web_framework.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Idan on 2018/1/7.
 */
public class StringUtil {

    public static Boolean isNotEmpty(String value) {
        return !StringUtil.isEmpty(value);
    }

    public static Boolean isEmpty(String value) {
        return StringUtils.isEmpty(value);
    }

    public static String[] splitString(String value, String sign) {
        return value.split(sign);
    }

}
