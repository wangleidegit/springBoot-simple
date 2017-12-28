package com.wanglei;

import com.wanglei.controller.TestController;
import com.wanglei.dao.mapper.UserMapper;
import com.wanglei.dao.model.User;
import com.wanglei.service.TestService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Tao on 2017/12/28.
 * api
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration  // web项目
public class ApplicationTest {

    private MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationConnect;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
    }

    @Test
    public void test() throws Exception {
        String name = "wanglei";
        MockHttpServletRequestBuilder accept = MockMvcRequestBuilders.get("/test/one")
                .param("name", name);

        MvcResult mvcResult = mvc.perform(accept).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();

        Assert.assertTrue("错误，正确的返回值为200", status == 200);
        Assert.assertFalse("错误，正确的返回值为200", status != 200);
        Assert.assertTrue("数据一致", name.equals(content));
        Assert.assertFalse("数据不一致", !name.equals(content));
    }

    @Test
    public void two() throws Exception {
        Integer id = 2;
        MockHttpServletRequestBuilder accept = MockMvcRequestBuilders.get("/test/two")
                .param("id", String.valueOf(id));

        MvcResult mvcResult = mvc.perform(accept).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();

        Assert.assertTrue("错误，正确的返回值为200", status == 200);
        Assert.assertFalse("错误，正确的返回值为200", status != 200);
        Assert.assertTrue("数据一致", "b".equals(content));
        Assert.assertFalse("数据不一致", !"b".equals(content));
    }

}