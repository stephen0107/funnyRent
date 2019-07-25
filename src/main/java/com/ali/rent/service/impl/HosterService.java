package com.ali.rent.service.impl;


import com.ali.rent.dao.mapping.HosterMapper;
import com.ali.rent.pojo.Hoster;
import com.ali.rent.service.IHosterService;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HosterService implements IHosterService {
 @Autowired
    private HosterMapper hosterMapper;

    @Override
    public Hoster getHosterById(Integer id) {
        Hoster hoster = new Hoster();
        hoster.setId(id);
        return  hosterMapper.selectOne(hoster);
    }

    @Override
    public int updateHoster(Integer id,String password,String phone,String email,String portrait,String business_area,String capacity) {
        Hoster hoster = new Hoster();
        hoster.setId(id);
        hoster = hosterMapper.selectOne(hoster);
        hoster.setPassword(password);
        hoster.setPhone(phone);
        hoster.setEmail(email);
        hoster.setPortrait(portrait);
        hoster.setBusinessArea(business_area);
        hoster.setCapacity(capacity);
        return hosterMapper.updateByPrimaryKey(hoster);
    }
}
