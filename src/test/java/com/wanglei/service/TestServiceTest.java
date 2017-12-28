package com.wanglei.service;

import com.wanglei.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Tao on 2017/12/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class TestServiceTest {

    @Resource
    private TestService testService;

    Integer count = 1;

    @Test
    public void getName() throws Exception {
        String wanglei = testService.getName("wanglei");
        count = 2;
        System.out.println(wanglei);
    }

    @Test
    public void getAge() throws Exception {
        Integer age = testService.getAge(count);
        System.out.println(age);
    }

    @Test
    public void getDataName() throws Exception {
        String dataName = testService.getDataName(2);
        System.out.println(dataName);
    }

}