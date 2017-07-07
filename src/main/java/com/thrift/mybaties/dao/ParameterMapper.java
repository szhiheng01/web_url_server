package com.thrift.mybaties.dao;

import com.thrift.mybaties.model.ParameterModel;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterMapper {

    int deleteByPrimaryKey(Integer parameterId);

    int insert(ParameterModel record);

    int insertSelective(ParameterModel record);

    ParameterModel selectByPrimaryKey(Integer parameterId);

    int updateByPrimaryKeySelective(ParameterModel record);

    int updateByPrimaryKeyWithBLOBs(ParameterModel record);

    int updateByPrimaryKey(ParameterModel record);
}