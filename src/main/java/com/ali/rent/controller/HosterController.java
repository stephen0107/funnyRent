package com.ali.rent.controller;


import com.ali.rent.pojo.Hoster;
import com.ali.rent.service.IHosterService;
import com.ali.rent.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
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

    @RequestMapping("/hosterRegister")
    public String toHome(){

        return "/hosterRegister";
    }



    /**
     * 注册，并上传头像
     * @param hoster
     * @param file
     * @return
     */
    @RequestMapping(value = "/addHoster",method = RequestMethod.POST)
    public ModelAndView addHoster(Hoster hoster, @RequestParam("file") MultipartFile file){
        ModelAndView modelAndView = new ModelAndView();
        if(!file.isEmpty()){
            //把图片set 进 hoster对象里面
            hoster.setPortrait(file.getOriginalFilename());
            System.out.println(file.getOriginalFilename());

            try {
                file.transferTo(new File("static/images/user"+file.getOriginalFilename()));
            } catch (IOException e) {
                System.out.println("error :"+e);
            }

        }

        Integer integer = hosterService.addHoster(hoster);
        if(integer>1){
            modelAndView.addObject("msg","成功上传图片");
        }else {
            modelAndView.addObject("msg","上传失败");
        }
        modelAndView.setViewName("02-home");
        return modelAndView;
    }


    /**
     *  查询填写的用户名是否已经存在
     * @param username
     * @return
     */
    @RequestMapping(value = "/checkName",method = RequestMethod.POST)
    public Object checkName(@RequestParam String username){
        System.out.println("用户名 ："+username);
        Integer count = hosterService.checkName(username);
        if(count>1){
            return true;
        }
        return false;
    }

    /**
     * 邮箱验证码
     * @param email
     * @return
     */
    @RequestMapping(value = "/checkEmail",method = RequestMethod.POST)
    public Object checkEmail(@RequestParam String email){
        int code =(int)Math.random()*1000;
        new Thread(new EmailUtil(email,code+"")).start();
        return code;
    }
}
