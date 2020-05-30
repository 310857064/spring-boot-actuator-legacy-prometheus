package com.tianwen.prometheus.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjq
 * @Date: 2020年05月28日 14:15
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @PostMapping(value = "/add")
    public void add() {
        log.info("add user success ...");
    }
}
