package com.nf.lc.dao;

import com.nf.lc.entity.Power;
import java.util.List;

public interface PowerMapper {
    int deleteByPrimaryKey(Integer powerId);

    int insert(Power record);

    Power selectByPrimaryKey(Integer powerId);

    List<Power> selectAll();

    int updateByPrimaryKey(Power record);
}