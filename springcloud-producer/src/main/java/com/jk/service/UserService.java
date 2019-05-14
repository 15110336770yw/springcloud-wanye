package com.jk.service;


import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    List<User> queryuser();

    void addquery(User user);

}
