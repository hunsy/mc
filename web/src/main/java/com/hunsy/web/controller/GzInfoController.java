package com.hunsy.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hunsy.metadata.entity.GzInfo;
import com.hunsy.service.GzInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hunsy
 * @date 2018/2/26
 */
@RestController
@RequestMapping(value = "/gz/info")
public class GzInfoController {

    @Autowired
    private GzInfoService gzInfoService;

    @GetMapping(value = "/page/{statisticId}")
    public ResponseEntity<PageInfo<GzInfo>> findPage(
            @PathVariable("statisticId") String statisticId,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size,
            GzInfo gzInfo
    ) {
        if (StringUtils.isNotEmpty(statisticId)) {
            gzInfo.setStatisticId(statisticId);
        }
        PageHelper.startPage(page, size);
        List<GzInfo> gzInfos = gzInfoService.findList(gzInfo);
        return ResponseEntity.ok(new PageInfo<>(gzInfos));
    }


    @PostMapping
    public ResponseEntity<Object> save(GzInfo gzInfo) {

        boolean flag = gzInfoService.saveGzInfo(gzInfo);
        return ResponseEntity.ok(flag);
    }
}
