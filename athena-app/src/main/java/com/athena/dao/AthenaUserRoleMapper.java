package com.athena.dao;

import com.athena.entity.AthenaUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AthenaUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaUserRole record);

    int insertSelective(AthenaUserRole record);

    AthenaUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaUserRole record);

    int updateByPrimaryKey(AthenaUserRole record);
}