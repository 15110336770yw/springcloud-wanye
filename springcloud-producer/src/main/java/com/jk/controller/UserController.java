package com.jk.controller;


import com.jk.model.User;
import com.jk.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //查询
    @RequestMapping("queryuser")
    @ResponseBody
    public List<User> queryuser(){

        return userService.queryuser();
    }

    //新增
    @RequestMapping("adduser")
    @ResponseBody
    public Boolean adduser(User user){
        try {
            userService.addquery(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }





}
