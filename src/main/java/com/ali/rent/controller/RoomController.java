package com.ali.rent.controller;

import com.ali.rent.pojo.Room;
import com.ali.rent.service.IHosterService;
import com.ali.rent.service.RoomService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * @author
 */
@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private IHosterService hosterService;

    /**
     * 通过ID获取前端信息
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping("/{id}")
    public String showPic(@PathVariable("id") Integer id, ModelMap modelMap){
        modelMap.addAttribute("room",roomService.getRoomById(id));
        modelMap.addAttribute("hoster",hosterService.getHosterById(id));
        return "24_Property_Single";
    }
    @RequestMapping("/01.Home")
    public String toHome(){
        return "redirect:/home";
    }

    /*------------------------wuxiaobo--------------------------*/
    @RequestMapping(value = "/02_Home",method = RequestMethod.GET)
    public String to02_Home(){
        return "02_Home";
    }

    @RequestMapping(value = "/11_Agent_Profile",method = RequestMethod.GET)
    public String to11_Agent_Profile(){
        return "11_Agent_Profile";
    }


    /*@RequestMapping(value = "/22_List_Layout_With_Sidebar",method = RequestMethod.GET)
    public String toRoomList(Model model){
        List<Room> roomList = roomService.selectAll();
        model.addAttribute("roomList",roomList);
        return "22_List_Layout_With_Sidebar";
    }*/

    /*@RequestMapping(value = "/22_List_Layout_With_Sidebar",method = RequestMethod.GET)
    public String toRoomList(ModelMap map, @RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo){
        Integer pageSize=3;//每页显示记录数
        PageHelper.startPage(pageNo, pageSize);
        List<Room> roomsList = roomService.selectAll();
        PageInfo<Room> pageInfo = new PageInfo<Room>(roomsList);
        map.addAttribute("pageInfo",pageInfo);
        return "22_List_Layout_With_Sidebar";
    }*/

    /*@RequestMapping(value = "/22_List_Layout_With_Sidebar",method = RequestMethod.GET)
    public String toRoomList(ModelMap map, @RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo, @RequestParam(defaultValue="id",required=true,value="sortord") String sortord){
        System.out.println(sortord);
        Integer pageSize=3;//每页显示记录数
        PageHelper.startPage(pageNo, pageSize);
        List<Room> roomsList = roomService.selectSortordAll(sortord);
        PageInfo<Room> pageInfo = new PageInfo<Room>(roomsList);
        map.addAttribute("pageInfo",pageInfo);
        return "22_List_Layout_With_Sidebar";
    }*/

    @RequestMapping(value = "/22_List_Layout_With_Sidebar",method = RequestMethod.GET)
    public String toRoomList(ModelMap map, @RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,
                             /*地址搜索*/
                             @RequestParam(defaultValue="",required=true,value="site") String site,
                             /*出租类型搜索*/
                             @RequestParam(defaultValue="",required=true,value="pattern") String pattern,
                             /*房间布局搜索*/
                             @RequestParam(defaultValue="",required=true,value="layout") String layout,
                             /*房间价格最低*/
                             @RequestParam(defaultValue="0",required=true,value="pricemin") String pricemin,
                             /*房间价格最高*/
                             @RequestParam(defaultValue="9999",required=true,value="pricemax") String pricemax,
                             @RequestParam(defaultValue="id",required=true,value="sortord") String sortord){
        System.out.println(sortord);
        Integer pageSize=3;//每页显示记录数
        PageHelper.startPage(pageNo, pageSize);
        List<Room> roomsList = roomService.selectSortordAll(site,pattern,layout,pricemin,pricemax,sortord);
        PageInfo<Room> pageInfo = new PageInfo<Room>(roomsList);
        map.addAttribute("pageInfo",pageInfo);
        return "22_List_Layout_With_Sidebar";
    }

    @RequestMapping(value = "/24_Property_Single",method = RequestMethod.GET)
    public String to24_Property_Single(){
        return "24_Property_Single";
    }
}
