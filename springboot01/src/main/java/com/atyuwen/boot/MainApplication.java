package com.atyuwen.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
*  @author yuwen
* @ description 启动SpringBoot项目的主入口
* @ Create 2023.7.14
*/
@SpringBootApplication // 这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
