package com.athena.dao;

import com.athena.entity.AthenaAccount;

public interface AthenaAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AthenaAccount record);

    int insertSelective(AthenaAccount record);

    AthenaAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AthenaAccount record);

    int updateByPrimaryKey(AthenaAccount record);
}