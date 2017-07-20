package com.creditease.mybaties.model;

import java.util.Date;

public class UrlInfoModel {
    private Integer id;

    private String projectname;

    private String urlname;

    private String contexttype;

    private String requestmethod;

    private String transfermethod;

    private String creattime;

    private String updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname == null ? null : urlname.trim();
    }

    public String getContexttype() {
        return contexttype;
    }

    public void setContexttype(String contexttype) {
        this.contexttype = contexttype == null ? null : contexttype.trim();
    }

    public String getRequestmethod() {
        return requestmethod;
    }

    public void setRequestmethod(String requestmethod) {
        this.requestmethod = requestmethod == null ? null : requestmethod.trim();
    }

    public String getTransfermethod() {
        return transfermethod;
    }

    public void setTransfermethod(String transfermethod) {
        this.transfermethod = transfermethod == null ? null : transfermethod.trim();
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }


    @Override
    public String toString() {
        return "UrlInfoModel{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", urlname='" + urlname + '\'' +
                ", contexttype='" + contexttype + '\'' +
                ", requestmethod='" + requestmethod + '\'' +
                ", transfermethod='" + transfermethod + '\'' +
                ", creattime=" + creattime +
                ", updatetime=" + updatetime +
                '}';
    }
}