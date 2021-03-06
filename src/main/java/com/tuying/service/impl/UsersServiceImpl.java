package com.tuying.service.impl;

import com.tuying.dao.UsersDao;
import com.tuying.model.Users;
import com.tuying.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/8/16
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    /**
     * 查询所有的用户
     *
     * @return
     */
    @Override
    public List<Users> listUsers() {
        return usersDao.listUsers();
    }

    /**
     * 根据用户id查询用户
     *
     * @param userId
     * @return
     */
    @Override
    public Users getUserById(Long userId) {
        return usersDao.getUserById(userId);
    }

    /**
     * 新增用户
     *
     * @param user
     */
    @Override
    public void saveUser(Users user) {
        usersDao.saveUser(user);
    }

    /**
     * 更新
     *
     * @param user
     */
    @Override
    public void updateUser(Users user) {
        usersDao.updateUser(user);
    }

    /**
     * 删除用户
     *
     * @param userId
     */
    @Override
    public void removeUser(Long userId) {
        usersDao.removeUser(userId);
    }
}
