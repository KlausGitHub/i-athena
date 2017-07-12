package com.athena.dao;

import com.athena.entity.AthenaUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AthenaUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaUser record);

    int insertSelective(AthenaUser record);

    AthenaUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaUser record);

    int updateByPrimaryKey(AthenaUser record);
}