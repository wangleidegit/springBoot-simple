package com.wanglei.controller;

import com.wanglei.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Tao on 2017/12/28.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String test(
            @RequestParam(value = "name") String name
    ){
        String serviceName = testService.getName(name);
        return serviceName;
    }

    @RequestMapping(value = "/two", method = RequestMethod.GET)
    public String dataTest(
            @RequestParam(value = "id") Integer id
    ){
        String dataName = testService.getDataName(id);
        return dataName;
    }
}
