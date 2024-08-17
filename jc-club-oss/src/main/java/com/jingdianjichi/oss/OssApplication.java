package com.jingdianjichi.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * oss服务启动器
 * 
 * @author: wuwenshuai
 * @date: 2024/07/11
 */
@SpringBootApplication
@ComponentScan("com.jingdianjichi")
public class OssApplication {
    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class);
    }

}
