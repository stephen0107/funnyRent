package com.ali.rent.service;


import com.ali.rent.dao.mapping.HosterMapper;
import com.ali.rent.pojo.Hoster;

import java.util.List;

public interface IHosterService {
    Hoster getHosterById(Integer id);
    int updateHoster(Integer id,String password,String phone,String email,String portrait,String business_area,String capacity);

    /*李能明*/
    //添加房东（注册）
    Integer addHoster(Hoster hoster);

    //判断房东用户名是否已存在
    Integer checkName(String username);

    //判断登录的用户名和密码是否正确
    Hoster findUsernameAndPassword(String username,String password);
}
