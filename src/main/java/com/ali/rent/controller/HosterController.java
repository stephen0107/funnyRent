package com.ali.rent.controller;


import com.ali.rent.pojo.Hoster;
import com.ali.rent.service.IHosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 * Created by zrh on 2019/7/22.
 */
@Controller
@RequestMapping("/hoster")
public class HosterController
{
    @Autowired
    private IHosterService hosterService;



    //房东详细信息
    //当url处于这个时，由listCategory方法来处理请求
    @RequestMapping("/{id}")
    public String hostermassage(@PathVariable("id") Integer id,ModelMap modelMap ){

        //获取到查询的数据
        Hoster hosterById = hosterService.getHosterById(id);
        modelMap.addAttribute("hoster",hosterById);
        //返回ModelAndView对象mav
        return "11_Agent_Profile";
    }

    @RequestMapping("/updatehoster")
    public String uodatehoster(Integer id,String password,String phone,String email,String portrait,String business_area,String capacity,ModelMap modelMap){
        hosterService.updateHoster(id, password, phone, email, portrait, business_area, capacity);
        return hostermassage(id,modelMap);
    }

    @RequestMapping("/01_Home")
    public String toHome(){

        return "redirect:/home";
    }
}
