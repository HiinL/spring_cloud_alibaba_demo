package com.xun.sentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName 主Controller
 * @author: Uny
 * @Date: 2019/6/20 11:40
 * @Description:
 * @Version 1.8
 */
@Slf4j
@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "chengxun.org.cn";
    }
}
