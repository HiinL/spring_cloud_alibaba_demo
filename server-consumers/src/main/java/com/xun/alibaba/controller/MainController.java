package com.xun.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test() {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance serviceInstance = loadBalancerClient.choose("server-provider");
        String url = serviceInstance.getUri() + "/hello?name=" + "xun";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;
    }
}
