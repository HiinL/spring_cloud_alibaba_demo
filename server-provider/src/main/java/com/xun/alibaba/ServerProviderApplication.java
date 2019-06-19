package com.xun.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xun
 * 1、@EnableDiscoveryClient开启Spring Cloud的服务注册与发现
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApplication.class, args);
    }
}
