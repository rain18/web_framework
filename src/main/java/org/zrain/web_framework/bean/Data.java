package org.zrain.web_framework.bean;

/**
 * Created by Idan on 2018/1/7.
 */
@lombok.Data
public class Data {

    private Object model;

    public Data(Object model) {
        this.model = model;
    }
}
