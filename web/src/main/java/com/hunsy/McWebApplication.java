package com.hunsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author hunsy
 * @date 2018/2/23
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hunsy.metadata.mapper")
public class McWebApplication{


    public static void main(String[] args) {
        SpringApplication.run(McWebApplication.class, args);
    }

}
