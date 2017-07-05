package com.creditease.mybaties.model;

import org.springframework.stereotype.Service;

import java.util.Date;

public class UrlInfoModel {
    private Integer urlId;

    private String projectName;

    private String urlName;

    private String contexttype;

    private String requestMethod;

    private String transferMethod;

    private Date creattime;

    private Date updateime;

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName == null ? null : urlName.trim();
    }

    public String getContexttype() {
        return contexttype;
    }

    public void setContexttype(String contexttype) {
        this.contexttype = contexttype == null ? null : contexttype.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getTransferMethod() {
        return transferMethod;
    }

    public void setTransferMethod(String transferMethod) {
        this.transferMethod = transferMethod == null ? null : transferMethod.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdateime() {
        return updateime;
    }

    public void setUpdateime(Date updateime) {
        this.updateime = updateime;
    }

    @Override
    public String toString() {
        return "UrlInfoModel{" +
                "urlId=" + urlId +
                ", projectName='" + projectName + '\'' +
                ", urlName='" + urlName + '\'' +
                ", contexttype='" + contexttype + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", transferMethod='" + transferMethod + '\'' +
                ", creattime=" + creattime +
                ", updateime=" + updateime +
                '}';
    }
}