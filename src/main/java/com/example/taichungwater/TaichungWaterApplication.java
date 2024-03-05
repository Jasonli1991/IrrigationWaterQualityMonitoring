package com.example.taichungwater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@Import(AppConfig.class)
@MapperScan("com.example.mapper")
@EnableScheduling
public class TaichungWaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaichungWaterApplication.class, args);
    }

}
