package com.wanglei.service;

import com.wanglei.dao.mapper.UserMapper;
import com.wanglei.dao.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Tao on 2017/12/28.
 */
@Service
public class Test2Service {

    @Resource
    private UserMapper userMapper;

    public String helloworld(){
        User user = userMapper.selectByPrimaryKey(2);
        return "1";
    }
}
