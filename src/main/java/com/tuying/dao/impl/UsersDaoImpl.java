package com.tuying.dao.impl;

import com.tuying.dao.UsersDao;
import com.tuying.mapper.UsersMapper;
import com.tuying.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/8/16
 */
@Repository
public class UsersDaoImpl implements UsersDao {

    @Autowired
    private UsersMapper usersMapper;


    /**
     * 查询所有的用户
     *
     * @return
     */
    @Override
    public List<Users> listUsers() {
        return usersMapper.listUsers();
    }

    /**
     * 根据用户id查询用户
     *
     * @param userId
     * @return
     */
    @Override
    public Users getUserById(Long userId) {
        return usersMapper.getUserById(userId);
    }

    /**
     * 新增用户
     *
     * @param user
     */
    @Override
    public void saveUser(Users user) {
        usersMapper.saveUser(user);
    }

    /**
     * 更新
     *
     * @param user
     */
    @Override
    public void updateUser(Users user) {
        usersMapper.updateUser(user);
    }

    /**
     * 删除用户
     *
     * @param userId
     */
    @Override
    public void removeUser(Long userId) {
        usersMapper.removeUser(userId);
    }
}
