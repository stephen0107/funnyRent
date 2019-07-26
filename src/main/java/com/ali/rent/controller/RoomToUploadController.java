package com.ali.rent.controller;

import com.ali.rent.pojo.Room;
import com.ali.rent.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RoomToUploadController {

    @Resource
    RoomService roomService;

    @RequestMapping(value = "/25_Room_upload")
    public String room(){
        return "25_Room_upload";
    }
    //获取form数据
    @RequestMapping(value = "/roomToUp",method = RequestMethod.POST)
    public String roomToUpload(HttpServletRequest request){
        Room room = new Room();
        //room.setHosterId(request.getIntHeader("hoster_id"));
        //room.setSiteDisId(request.getIntHeader("site_dis_id"));
        room.setName(request.getParameter("name"));
        room.setAddress(request.getParameter("address"));
        String size = request.getParameter("size");
        room.setSize(Integer.parseInt(size));
        room.setLayout(request.getParameter("layout"));
        room.setIntro(request.getParameter("intro"));
        room.setPict1(request.getParameter("pict1"));
        room.setTrait(request.getParameter("trait"));
        room.setLeasePattern(request.getParameter("leasePattern"));
        room.setLeaseTime(request.getParameter("leaseTime"));
       // room.setPrice(request.getParameter("price"));
        String price = request.getParameter("price");
        room.setPrice(Integer.parseInt(price));

         roomService.insertRooom(room);
        //调用RoomServiceImpl里面插入的方法 把room对象传进去
        return "redirect:/02_Home";
    }
    @RequestMapping(value = "/02_Home",method = RequestMethod.GET)
    public String to02_Home(){
        return "02_Home";
    }
}
