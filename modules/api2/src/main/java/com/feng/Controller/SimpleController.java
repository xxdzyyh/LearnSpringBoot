package com.feng.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping("/simple")
    @ResponseBody
    public String simple() {
        return "Simple,SpringBoot";
    }
}
