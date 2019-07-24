package com.ali.rent.dao.mapping;

import com.ali.rent.pojo.Room;
import io.swagger.models.auth.In;
import tk.mybatis.mapper.common.Mapper;

public interface RoomMapper extends Mapper<Room> {
    int updateRoom(Integer id);
}