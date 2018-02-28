package com.hunsy.metadata.mapper;

import com.hunsy.metadata.entity.GzInfo;
import com.hunsy.metadata.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface GzInfoMapper extends MyMapper<GzInfo> {

    /**
     * 查询类型的最后一个
     *
     * @return
     */
    GzInfo findLastByType(@Param("type") int type);
}