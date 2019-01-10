package com.sun.demo.controller;

import com.sun.demo.entity.UserEntity;
import com.sun.demo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户模块
 *
 * @author sun
 * @date 2019/1/8 13:24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping("/list")
    public List<UserEntity> list(){
        return userJPA.findAll();
    }






}
