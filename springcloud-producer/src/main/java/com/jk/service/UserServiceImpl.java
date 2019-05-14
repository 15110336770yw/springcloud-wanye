package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    //查询
    @Override
    public List<User> queryuser() {
        return userMapper.queryuser();
    }

    //新增
    @Override
    public void addquery(User user) {

        userMapper.addquery(user);
    }


}
