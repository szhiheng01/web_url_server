package com.creditease.mybaties.dao;

import com.creditease.mybaties.model.UrlInfoModel;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public interface UrlInfoMapper {

    int deleteByPrimaryKey(Integer urlId);

    int insert(UrlInfoModel record);

    int insertSelective(UrlInfoModel record);

    List<UrlInfoModel> selectByProjectName(String projectName);

    UrlInfoModel selectByPrimaryKey(Integer urlId);

    int updateByPrimaryKeySelective(UrlInfoModel record);

    int updateByPrimaryKey(UrlInfoModel record);
}