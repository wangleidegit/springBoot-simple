package com.wanglei.service;

import com.wanglei.dao.mapper.UserMapper;
import com.wanglei.dao.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Tao on 2017/12/28.
 */
@Service
public class TestService {

    @Resource
    private UserMapper userMapper;

    public String getName(String name){
        return name;
    }

    public Integer getAge(Integer age){
        return age;
    }

    public String getDataName(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user.getName();
    }
}
