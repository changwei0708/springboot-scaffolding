package com.fzzf.web;

import java.util.HashMap;
import java.util.Map;

import com.fzzf.config.MyProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

    @Autowired
    private MyProperties properties;

    @Test
    public void getHello() throws Exception {
        System.out.println(properties.getTitle());
        Assert.assertEquals(properties.getTitle(), "fzzf");
        Assert.assertEquals(properties.getDescription(), "专注那些不变的底层原理");
    }

    @Test
    public void testMap() throws Exception {
        Map<String, Long> orderMinTime=new HashMap<String, Long>();
        long xx=orderMinTime.get("123");
    }

}
