package com.ali.dao.mappinng;

import com.ali.rent.dao.mapping.HosterMapper;
import com.ali.rent.pojo.Hoster;
import com.ali.rent.service.IHosterService;
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
    private IHosterService hosterService;
    @Test
    public void HosterServiceTest(){
        Hoster hoster = hosterService.getHosterById(1);

        System.out.println("信息：："+hoster);
    }
}
