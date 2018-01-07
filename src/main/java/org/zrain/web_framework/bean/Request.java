package org.zrain.web_framework.bean;

import lombok.Data;

/**
 * Created by Idan on 2018/1/7.
 */
@Data
public class Request {

    private String requestMethod;
    private String requestPath;

    public Request(String requestMethod, String requestPath) {
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

}
