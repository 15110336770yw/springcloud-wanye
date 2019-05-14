package com.jk.service;

import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("springcloud-server")
public interface UserService {

    @GetMapping("queryuser")
    List<User> queryuser();

    @PostMapping("adduser")
    void adduser(User user);
}
