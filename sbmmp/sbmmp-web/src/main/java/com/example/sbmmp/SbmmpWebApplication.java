package com.example.sbmmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sbmmp.dao")
public class SbmmpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmmpWebApplication.class, args);
    }

}
