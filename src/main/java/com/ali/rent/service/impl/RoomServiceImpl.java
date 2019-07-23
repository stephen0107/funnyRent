package com.ali.rent.service.impl;

import com.ali.rent.dao.mapping.RoomMapper;
import com.ali.rent.pojo.Room;
import com.ali.rent.service.RoomService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    RoomMapper roomMapper;
    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(Room room) {
        return 0;
    }

    @Override
    public int insert(Room room) {
        return 0;
    }

    @Override
    public int insertSelective(Room room) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List<Room> selectAll() {
        return roomMapper.selectAll();
    }

    @Override
    public Room selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public int selectCount(Room room) {
        return 0;
    }

    @Override
    public List<Room> select(Room room) {
        return null;
    }

    @Override
    public Room selectOne(Room room) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Room room) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Room room) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public List<Room> selectByExample(Object o) {
        return null;
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public int updateByExample(Room room, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(Room room, Object o) {
        return 0;
    }

    @Override
    public List<Room> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<Room> selectByRowBounds(Room room, RowBounds rowBounds) {
        return null;
    }
}
