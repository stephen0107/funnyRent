package com.ali.rent.service;


import com.ali.rent.pojo.Room;

import java.util.List;

public interface RoomService {

    List<Room> selectAll();

    Integer updateById(Integer id);

    Room getRoomById(Integer id);

    List<Room> selectSortordAll(String site,String pattern,String layout,String pricemin,String pricemax,String sortord);
}
