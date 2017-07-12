package com.athena.dao;

import com.athena.entity.AthenaOrg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AthenaOrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaOrg record);

    int insertSelective(AthenaOrg record);

    AthenaOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaOrg record);

    int updateByPrimaryKey(AthenaOrg record);
}