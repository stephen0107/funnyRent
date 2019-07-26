package com.ali.rent.dao.mapping;

import com.ali.rent.pojo.Room;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoomMapper extends Mapper<Room> {
    int updateRoom(Integer id);
    int insertRooom(Room room);
    List<Room> selectSortordAll(@Param("site")String site,@Param("pattern")String lease,@Param("layout")String layout,@Param("pricemin")String priceMin,@Param("pricemax")String priceMax,@Param("sortord")String sortord);
}