package com.thrift.mybaties.dao;

import com.thrift.mybaties.model.UrlInfoModel;
import org.springframework.stereotype.Repository;

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