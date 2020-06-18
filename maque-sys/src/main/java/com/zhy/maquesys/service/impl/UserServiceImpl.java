package com.zhy.maquesys.service.impl;

import com.zhy.maquesys.mapper.UserMapper;
import com.zhy.maquesys.model.User;
import com.zhy.maquesys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author zhangyu
 * @date 2020/6/18 3:38 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Optional<User> getUserById(String id) {
        return Optional.ofNullable(userMapper.selectByPrimaryKey(id));
    }
}
