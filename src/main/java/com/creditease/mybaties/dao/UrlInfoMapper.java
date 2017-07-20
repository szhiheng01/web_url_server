package com.creditease.mybaties.dao;

import com.creditease.mybaties.model.UrlInfoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UrlInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UrlInfoModel record);

    int insertSelective(UrlInfoModel record);

    UrlInfoModel selectByPrimaryKey(Integer id);

    List<UrlInfoModel> selectByUrlName(String urlName);

    int updateByPrimaryKeySelective(UrlInfoModel record);

    int updateByPrimaryKey(UrlInfoModel record);
}