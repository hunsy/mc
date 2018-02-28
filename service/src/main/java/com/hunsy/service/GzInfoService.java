package com.hunsy.service;

import com.hunsy.commons.constants.GenerateId;
import com.hunsy.commons.constants.GzType;
import com.hunsy.metadata.entity.GzInfo;
import com.hunsy.metadata.entity.GzStatistic;
import com.hunsy.metadata.mapper.GzInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author hunsy
 * @date 2018/2/26
 */
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class GzInfoService {

    @Autowired
    private GzInfoMapper gzInfoMapper;
    @Autowired
    private GzStatisticService gzStatisticService;


    /**
     * 新增固资信息
     *
     * @param gzInfo
     * @return
     */
    public boolean saveGzInfo(GzInfo gzInfo) {

        GzStatistic statistic = gzStatisticService.findOne(gzInfo.getStatisticId());

        gzInfo.setId(GenerateId.getId());
        gzInfo.setType(statistic.getType());
        GzInfo lastGz = gzInfoMapper.findLastByType(statistic.getType());
        gzInfo.setGzNo(getGzNo(statistic.getType(), lastGz.getGzNo()));
        Date date = new Date();
        gzInfo.setCreatedAt(date);
        gzInfo.setUpdatedAt(date);
        return gzInfoMapper.insert(gzInfo) == 1;
    }

    /**
     * 查询列表
     *
     * @param gzInfo
     * @return
     */
    public List<GzInfo> findList(GzInfo gzInfo) {

        return gzInfoMapper.select(gzInfo);
    }

    /**
     * 获取gz_no
     *
     * @param gzNo
     * @return
     */
    public String getGzNo(int type, String gzNo) {
        String profix = GzType.findByType(type).name() + "_" + DateTime.now().toString("yyyyMMdd") + "_";
        if (StringUtils.isEmpty(gzNo)) {
            return profix.concat("1");
        }
        String[] arr = StringUtils.split(gzNo, "_");
        return profix + (Integer.valueOf(arr[2]) + 1);
    }

}
