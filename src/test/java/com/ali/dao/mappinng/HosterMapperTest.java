package com.ali.dao.mappinng;

import com.ali.rent.dao.mapping.HosterMapper;
import com.ali.rent.pojo.Hoster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml"})
public class HosterMapperTest {
    @Resource
    private HosterMapper hosterMapper;
    @Test
    public void testSelectAll(){
        List<Hoster> hosters = hosterMapper.selectAll();
        hosters.forEach(hoster -> {
            if(hoster.getId() == 1){
                System.out.println("信息：："+hoster.toString());
            }
        });
    }
}
