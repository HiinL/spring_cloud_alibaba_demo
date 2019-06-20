package com.xun.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Uny
 * @Date: 2019/6/20 9:09
 * @Version 1.8
 */
@FeignClient("server-provider")
public interface MainService {

    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}
