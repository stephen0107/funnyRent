package com.ali.rent.controller;

import com.ali.rent.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @RequestMapping(value = "/toRoomPage",method = RequestMethod.GET)
    public String toRoomPage(){

        return "login";
    }

}
