package com.ali.rent.service;


import com.ali.rent.dao.mapping.HosterMapper;
import com.ali.rent.pojo.Hoster;

import java.util.List;

public interface IHosterService {
    Hoster getHosterById(Integer id);
    int updateHoster(Integer id,String password,String phone,String email,String portrait,String business_area,String capacity);
}
