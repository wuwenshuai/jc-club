package com.jingdianjichi.subject;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 *
 * @author: wuwenshuai
 * @date: 2024/07/1
 */
@SpringBootApplication
@ComponentScan("com.jingdianjichi")
@MapperScan("com.jingdianjichi.**.mapper")
//@EnableFeignClients(basePackages = "com.jingdianjichi")
public class SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }

}
