package com.athena.dao;

import com.athena.entity.AthenaRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AthenaRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaRole record);

    int insertSelective(AthenaRole record);

    AthenaRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaRole record);

    int updateByPrimaryKey(AthenaRole record);
}