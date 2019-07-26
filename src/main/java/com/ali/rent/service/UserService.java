package com.ali.rent.service;

import com.ali.rent.pojo.User;

public interface UserService {


    //判断用户名是否存在
    Integer checkUserName(String username);

    //增加用户
    Integer insertUser(User user);

    //判断客户的账号密码是否正确
    User checkLogin(String username, String password);

}
