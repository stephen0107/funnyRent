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

    @Override
    public Integer addHoster(Hoster hoster) {
        Integer count = hosterMapper.addHoster(hoster);
        return count;
    }


    /**
     * 判断用户名是否已存在
     * @param username
     * @return
     */
    @Override
    public Integer checkName(String username) {
        return hosterMapper.checkName(username);
    }


    /**
     * 判断登录是否成功
     * @param username
     * @param password
     * @return
     */
    @Override
    public Hoster findUsernameAndPassword(String username, String password) {
        return hosterMapper.findUsernameAndPassword(username,password);
    }
}
