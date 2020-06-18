package com.zhy.maquesys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.zhy.maquesys.mapper")
public class MaqueSysApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MaqueSysApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MaqueSysApplication.class);
    }
}
