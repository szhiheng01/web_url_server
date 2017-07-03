package com.creditease.mybaties.model;

import java.util.Date;

public class ParameterModel {
    private Integer parameterId;

    private Integer urlId;

    private Date credittime;

    private Date updatetime;

    private String parameter;

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public Date getCredittime() {
        return credittime;
    }

    public void setCredittime(Date credittime) {
        this.credittime = credittime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }
}