package com.creditease.mybaties.dao;

import com.creditease.mybaties.model.UrlInfoModel;
import org.springframework.stereotype.Service;

@Service
public interface UrlInfoMapper {
    int deleteByPrimaryKey(Integer urlId);

    int insert(UrlInfoModel record);

    int insertSelective(UrlInfoModel record);

    UrlInfoModel selectByPrimaryKey(Integer urlId);

    int updateByPrimaryKeySelective(UrlInfoModel record);

    int updateByPrimaryKey(UrlInfoModel record);
}