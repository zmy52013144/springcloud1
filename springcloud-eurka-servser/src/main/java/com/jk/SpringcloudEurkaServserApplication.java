package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //代表开启的是eurka的注册中服务 //第二步 第三步访问  -->在创建一个新项目
public class SpringcloudEurkaServserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurkaServserApplication.class, args);
    }

}
