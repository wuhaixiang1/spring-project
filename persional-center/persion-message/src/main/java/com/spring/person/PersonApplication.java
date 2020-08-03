package com.spring.person;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.spring.person.mapper")
public class PersonApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }
}
