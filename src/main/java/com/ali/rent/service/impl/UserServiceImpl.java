package com.ali.rent.service.impl;

import com.ali.rent.dao.mapping.UserMapper;
import com.ali.rent.pojo.User;
import com.ali.rent.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    /**
     * 判断用户名是否已经存在
     * @param username
     * @return
     */
    @Override
    public Integer checkUserName(String username) {

        return userMapper.checkUserName(username);
    }

    /**
     *  添加用户
     * @param user
     * @return
     */
    @Override
    public Integer insertUser(User user) {
        Integer count = userMapper.insertUser(user);
        return count;
    }

    /**
     *   判断客户的账号密码是否正确
     * @param username  用户名
     * @param password  密码
     * @return
     */
    @Override
    public User checkLogin(String username, String password) {
        return userMapper.findByUserNameAndPassword(username,password);
    }

}
