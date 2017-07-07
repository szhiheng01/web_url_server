package com.thrift.mybaties.Utils;

import java.util.List;
import java.util.*;

/**
 * Created by songzhiheng on 2017/7/3.
 */
public class ResoultInfos {

    private int code;
    private String message;
    private String status;
    private List<?> list;

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

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
