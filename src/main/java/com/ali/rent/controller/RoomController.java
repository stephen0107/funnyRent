package com.ali.rent.controller;

import com.ali.rent.pojo.Room;
import com.ali.rent.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * @author
 */
@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    /**
     * 通过ID获取前端信息
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping("/{id}")
    public String showPic(@PathVariable("id") Integer id, ModelMap modelMap){

        modelMap.addAttribute("room",roomService.getRoomById(id));
        return "24_Property_Single";
    }
    @RequestMapping("/01.Home")
    public String toHome(){
        return "redirect:/home";
    }
}
