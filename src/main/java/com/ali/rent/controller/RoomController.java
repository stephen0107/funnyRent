package com.ali.rent.controller;

import com.ali.rent.pojo.Room;
import com.ali.rent.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * @author
 */
@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;


    @RequestMapping("/{id}")
    public String showPic(@PathVariable("id") Integer id, ModelMap modelMap){

        modelMap.addAttribute("room",roomService.getRoomById(id));
        return "24_Property_Single";
    }
}
