package org.zrain.web_framework.bean;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Idan on 2018/1/7.
 */
@Data
public class View {

    private String path;
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }
}
