package com.jk.mapper;

import com.jk.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from u_user")
    List<User> queryuser();

    @Insert("insert into u_user(id,username,sex,usertype) values(#{id},#{username},#{sex},#{usertype})")
    void addquery(User user);











}
