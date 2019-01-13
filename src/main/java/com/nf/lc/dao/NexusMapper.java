package com.nf.lc.dao;

import com.nf.lc.entity.Nexus;
import java.util.List;

public interface NexusMapper {
    int deleteByPrimaryKey(Integer nexusId);

    int insert(Nexus record);

    Nexus selectByPrimaryKey(Integer nexusId);

    List<Nexus> selectAll();

    int updateByPrimaryKey(Nexus record);
}