package com.athena.dao;

import com.athena.entity.AthenaRoleRes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AthenaRoleResMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaRoleRes record);

    int insertSelective(AthenaRoleRes record);

    AthenaRoleRes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaRoleRes record);

    int updateByPrimaryKey(AthenaRoleRes record);
}