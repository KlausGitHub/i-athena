package com.athena.dao;

import com.athena.entity.LotteryActivity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LotteryActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LotteryActivity record);

    int insertSelective(LotteryActivity record);

    LotteryActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LotteryActivity record);

    int updateByPrimaryKey(LotteryActivity record);
}