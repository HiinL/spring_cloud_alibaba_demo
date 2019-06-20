package com.xun.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName 主Controller
 * @author: Uny
 * @Date: 2019/6/20 9:37
 * @Description:
 * @Version 1.8
 */
@Slf4j
@RestController
@RefreshScope
public class MainController {

    @Value("${xunspace.title:}")
    private String title;

    @GetMapping("/test")
    public String hello() {
        return title;
    }
}
