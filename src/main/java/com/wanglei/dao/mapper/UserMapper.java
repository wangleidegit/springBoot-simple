package com.wanglei.dao.mapper;

import com.wanglei.dao.model.User;

/**
 * Created by Tao on 2017/12/28.
 */
public interface UserMapper {

    User selectByPrimaryKey(Integer id);
}
