package com.thrift.mybaties.dao;

import com.thrift.mybaties.model.UrlInfoModel;
import org.springframework.stereotype.Service;

@Service
public interface UrlInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UrlInfoModel record);

    int insertSelective(UrlInfoModel record);

    UrlInfoModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UrlInfoModel record);

    int updateByPrimaryKey(UrlInfoModel record);
}