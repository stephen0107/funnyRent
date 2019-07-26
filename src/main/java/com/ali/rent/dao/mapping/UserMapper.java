package com.ali.rent.dao.mapping;

import com.ali.rent.pojo.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    //判断用户名是否存在
    Integer checkUserName(String username);

    //增加用户
    Integer insertUser(User user);



    //根据用户名和密码查找。mybatis中有多个参数时，需要使用@Param注解
    User findByUserNameAndPassword(@Param("username")String username, @Param("password")String password);
}