package com.hunsy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hunsy.commons.constants.GenerateId;
import com.hunsy.metadata.entity.GzStatistic;
import com.hunsy.metadata.mapper.GzStatisticMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author hunsy
 * @date 2018/2/23
 */
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class GzStatisticService {

    @Autowired
    private GzStatisticMapper statisticMapper;

    /**
     * 保存
     *
     * @param gzStatistic
     * @return
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean saveGzStatistic(GzStatistic gzStatistic) {

        gzStatistic.setId(GenerateId.getId());
        Date date = new Date();
        gzStatistic.setCreatedAt(date);
        gzStatistic.setUpdatedAt(date);
        return statisticMapper.insertSelective(gzStatistic) == 1;
    }

    /**
     * 更新
     *
     * @param gzStatistic
     * @return
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean updateGzStatistic(GzStatistic gzStatistic) {
        gzStatistic.setUpdatedAt(new Date());
        return statisticMapper.updateByPrimaryKey(gzStatistic) == 1;
    }

    /**
     * id查询
     *
     * @param id
     * @return
     */
    public GzStatistic findOne(String id) {

        return statisticMapper.selectByPrimaryKey(id);
    }

    /**
     * 列表查询
     *
     * @param gzStatistic
     * @return
     */
    public List<GzStatistic> findList(GzStatistic gzStatistic) {

        return statisticMapper.select(gzStatistic);
    }
}
