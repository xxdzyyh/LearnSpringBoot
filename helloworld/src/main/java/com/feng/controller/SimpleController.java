package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello,SpringBoot";
    }
}