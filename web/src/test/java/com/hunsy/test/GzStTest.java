package com.hunsy.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hunsy.commons.constants.GzType;
import com.hunsy.metadata.entity.GzStatistic;
import com.hunsy.service.GzStatisticService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author hunsy
 * @date 2018/2/23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GzStTest {

    @Autowired
    private GzStatisticService statisticService;

    @Test
    public void saveTest() {

        GzStatistic statistic = new GzStatistic();

        statistic.setName("育仔圈");
        statistic.setType(GzType.JS.getType());
        boolean flag = statisticService.saveGzStatistic(statistic);
        System.out.println("----------------------------------------");
        System.out.println(flag);
    }

    @Test
    public void listTest() {

        List<GzStatistic> st = statisticService.findList(null);
        try {
            System.out.println(new ObjectMapper().writeValueAsString(st));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findOneTest(){

        GzStatistic statistic = statisticService.findOne("1519383657458Tn172Kx2NrbDKrGw");
        try {
            System.out.println(new ObjectMapper().writeValueAsString(statistic));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
