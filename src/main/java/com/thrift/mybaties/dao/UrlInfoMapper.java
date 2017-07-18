package com.thrift.mybaties.dao;

import com.thrift.mybaties.model.UrlInfoModel;

public interface UrlInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UrlInfoModel record);

    int insertSelective(UrlInfoModel record);

    UrlInfoModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UrlInfoModel record);

    int updateByPrimaryKey(UrlInfoModel record);
}