package com.springboot.shiromybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.springboot.shiromybatis.dao"})
public class ShiromybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiromybatisApplication.class, args);
    }

}
