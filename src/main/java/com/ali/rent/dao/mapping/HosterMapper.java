package com.ali.rent.dao.mapping;

import com.ali.rent.pojo.Hoster;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface HosterMapper extends Mapper<Hoster>
{
    //添加房东（注册）
    Integer addHoster(Hoster hoster);

    //判断登录的用户名和密码是否正确
    Integer checkName(String username);

    //判断登录的用户名和密码是否正确
    Hoster findUsernameAndPassword(String username,String password);
}