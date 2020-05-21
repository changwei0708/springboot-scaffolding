package com.fzzf.demo.controller;

import com.fzzf.demo.model.User;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/get")
    public User index() {
        User user=new User();
        user.setUserName("fzzf");
        user.setPassWord("123456");
        return user;
    }
}
