package com.creditease.mybaties.Utils;

import java.util.List;

/**
 * Created by songzhiheng on 2017/6/29.
 */
public class ResoultInfo {

    private int code;
    private String message;
    private String status;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResoultInfo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
