package com.xun.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @ClassName 主Controller
 * @author: Uny
 * @Date: 2019/6/19 17:38
 * @Description:
 * @Version 1.8
 */
@Slf4j
@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.debug("invoked name = " + name);
        return "hello " + name;
    }

}
