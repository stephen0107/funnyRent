package com.ali.dao.mappinng;


import com.ali.rent.dao.mapping.RoomMapper;
import com.ali.rent.pojo.Room;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml"})
public class RoomMapperTest {
    @Resource
    private RoomMapper roomMapper;

    @Test
    public void testSelectAll(){
        List<Room> rooms = roomMapper.selectAll();
        rooms.forEach(room -> {
            System.out.println(room.getName());
        });
    }

}
