package com.hunsy.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hunsy.commons.constants.GzType;
import com.hunsy.metadata.entity.GzStatistic;
import com.hunsy.service.GzStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hunsy
 * @date 2018/2/23
 */
@RestController
@RequestMapping(value = "/gz/statistic")
public class GzStatisticController {


    @Autowired
    private GzStatisticService gzStatisticService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Object> save(@RequestBody GzStatistic statistic) {

        boolean flag = gzStatisticService.saveGzStatistic(statistic);
        return ResponseEntity.ok(flag);
    }


    @GetMapping(value = "page")
    public ResponseEntity<PageInfo<GzStatistic>> page(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size,
            GzStatistic gzStatistic
    ) {

        PageHelper.startPage(page, size);
        List<GzStatistic> gzStatistics = gzStatisticService.findList(gzStatistic);
        return ResponseEntity.ok(new PageInfo(gzStatistics));
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<GzStatistic> one(@PathVariable(value = "id") String id) {
        GzStatistic gzStatistic = gzStatisticService.findOne(id);
        return ResponseEntity.ok(gzStatistic);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody GzStatistic gzStatistic) {

        boolean flag = gzStatisticService.updateGzStatistic(gzStatistic);
        return ResponseEntity.ok(flag);
    }

    @GetMapping(value = "types")
    public ResponseEntity<Object[]> types() {

        Object[] arr = Arrays.stream(GzType.values()).map(r -> {
            Map<String, Object> map = new HashMap<>(2);
            map.put("name", r.getName());
            map.put("type", r.getType());
            return map;
        }).toArray();

        return ResponseEntity.ok(arr);
    }
}
