package com.athena.dao;

import com.athena.entity.AthenaResource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AthenaResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaResource record);

    int insertSelective(AthenaResource record);

    AthenaResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaResource record);

    int updateByPrimaryKey(AthenaResource record);
}