package com.xun.alibaba.controller;

import com.xun.alibaba.service.MainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName 主Controller
 * @author: Uny
 * @Date: 2019/6/19 17:40
 * @Description:
 * @Version 1.8
 */
@Slf4j
@RestController
public class MainController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 使用 RestTemplate 调用服务
     * @return
     */
    @GetMapping("/test")
    public String test() {
        String url = "http://server-provider/hello?name=xun";
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;
    }

    @Autowired
    private MainService mainService;

    /**
     * 使用 Feign 调用服务
     * @return
     */
    @GetMapping("/test1")
    public String test1() {
        String result = mainService.hello("xun");
        return " return : " + result;
    }

}
