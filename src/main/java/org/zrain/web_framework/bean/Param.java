package org.zrain.web_framework.bean;

import lombok.Data;
import org.zrain.web_framework.utils.CastUtil;

import java.util.Map;

/**
 * Created by Idan on 2018/1/7.
 */
@Data
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

}
