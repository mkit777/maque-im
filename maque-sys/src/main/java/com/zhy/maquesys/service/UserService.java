package com.zhy.maquesys.service;

import com.zhy.maquesys.model.User;

import java.util.Optional;

/**
 * @author zhangyu
 * @date 2020/6/18 3:37 下午
 */

public interface UserService {

    /**
     * 根据用户Id获取用户信息
     * @param id 用户ID
     * @return Optional<User> 用户信息，
     */
    Optional<User> getUserById(String id);
}
