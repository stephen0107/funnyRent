package com.ali.rent.service.impl;

import com.ali.rent.dao.mapping.RoomMapper;
import com.ali.rent.pojo.Room;
import com.ali.rent.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    RoomMapper roomMapper;

    @Override
    public List<Room> selectAll() {
        List<Room> rooms = roomMapper.selectAll();
        return rooms;
    }
}
