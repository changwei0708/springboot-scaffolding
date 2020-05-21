package com.fzzf.demo.controller;


import com.fzzf.demo.config.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private MyProperties properties;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/config")
    public MyProperties config() {

        return properties;
    }

}
