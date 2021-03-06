package com.gmall.user.controller;

import com.gmall.bean.UserInfo;
import com.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<UserInfo> findAll() {
        return userService.listAllUserInfo();
    }

}
