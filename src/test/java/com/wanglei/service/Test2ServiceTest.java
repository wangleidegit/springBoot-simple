package com.wanglei.service;

import com.wanglei.Application;
import org.junit.Assert;
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
public class Test2ServiceTest {

    @Resource
    private Test2Service test2Service;

//    @Before
//    public void setUp() throws Exception {
//        test2Service = new Test2Service();
//    }

    @Test
    public void helloworld() throws Exception {
        String helloworld = test2Service.helloworld();
        Assert.assertEquals("1",helloworld);
    }

}