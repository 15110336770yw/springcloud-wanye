package com.jk.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询
    @GetMapping("queryuser")
   public List<User> queryuser(){

        return userService.queryuser();
   }

   //新增
    @PostMapping("adduser")
    public Boolean adduser(User user){
        try {
            userService.adduser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }







}
