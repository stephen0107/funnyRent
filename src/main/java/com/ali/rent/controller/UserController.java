package com.ali.rent.controller;

import com.ali.rent.pojo.User;
import com.ali.rent.service.UserService;
import com.ali.rent.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/02_Home")
    public String index(){
        return "02_Home";
    }



    /**
     * 注册  插入一条数据
     * @param user
     * @return
     */
    @RequestMapping(value ="/register",method = RequestMethod.POST)
    public Object register(@RequestBody User user){
        System.out.println(user.getUsername());
        System.out.println(user.getSex());

        Integer count = userService.insertUser(user);
        return count;
    }

    /**
     *   判断客户登录
     * @param username
     * @param password
     * @param modelAndView
     * @param session
     * @return
     */
    @RequestMapping(value = "/checkLogin",method = RequestMethod.GET)
    public ModelAndView checkLogin(String username, String password, ModelAndView modelAndView, HttpSession session) {
        ModelAndView view = new ModelAndView();
        User user = userService.checkLogin(username, password);
        if (user != null) {
            //登录成功，将user对象设置到HttpSession作用范围域中
            session.setAttribute("user", user);
            //转发到main请求
            /*mv.setView(new RedirectView("/smmbookapp/main"));*/
            //登录成功，跳转页面　
            view.setViewName("#");
        } else {
            //登录失败，设置失败信息，并调转到登录页面
            view.addObject("message", "用户名和密码错误，请重新输入");
            // 登录失败，跳转页面
            view.setViewName("02-home");
        }
        return view;
  }

    /**
     * 验证用户名是否被注册
     * @param username
     * @return
     */
    @RequestMapping(value ="/checkUserName",method = RequestMethod.POST)
    public Object checkUserName(@RequestParam String username){
        System.out.println("用户名为"+username);
        Integer count = userService.checkUserName(username);
        System.out.println("查到的为"+count);
        if(count>=1){
            return false;
        }
        return true;
    }



    /**
     * 邮箱验证码
     * @param email
     * @return
     */
//    @RequestMapping(value = "/checkEmail",method = RequestMethod.POST)
//    public Object checkEmail(@RequestParam String email){
//        int code =(int)Math.random()*1000;
//        new Thread(new EmailUtil(email,code+"")).start();
//        return code;
//    }
}
