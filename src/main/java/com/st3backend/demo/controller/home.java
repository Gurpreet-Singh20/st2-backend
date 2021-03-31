package com.st3backend.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {
    @RequestMapping("/user")
    public String user(){
    return "/st2";
    }

}
