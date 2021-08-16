package com.tuying.service;

import com.tuying.model.Users;

import java.util.List;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/8/16
 */
public interface UsersService {

    /**
     * 查询所有的用户
     * @return
     */
    List<Users> listUsers();

    /**
     * 根据用户id查询用户
     * @param userId
     * @return
     */
    Users getUserById(Long userId);

    /**
     * 新增用户
     * @param user
     */
    void saveUser(Users user);


    /**
     * 更新
     * @param user
     */
    void updateUser(Users user);


    /**
     * 删除用户
     * @param userId
     */
    void removeUser(Long userId);
}
