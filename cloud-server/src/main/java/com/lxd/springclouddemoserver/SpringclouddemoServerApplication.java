package com.lxd.springclouddemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringclouddemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoServerApplication.class, args);
    }

}
