package com.tuying.controller;

import com.tuying.model.Users;
import com.tuying.service.UsersService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/8/16
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/")
    public List<Users> listUsers() {
        return usersService.listUsers();
    }

    @GetMapping("/{userId}")
    public Users getUserById(@PathVariable("userId") Long userId) {
        return usersService.getUserById(userId);
    }

    /**
     * 新增用户
     *
     * @param user
     */
    @PostMapping("/")
    public void saveUser(Users user) {
        usersService.saveUser(user);
    }

    /**
     * 更新
     *
     * @param user
     */
    @PutMapping("/{userId}")
    public void updateUser(@PathVariable("userId") Long userId,  Users user) {
        usersService.updateUser(user);
    }

    /**
     * 删除用户
     *
     * @param userId
     */
    @Delete("/{userId}")
    public void removeUser(@PathVariable("userId") Long userId) {
        usersService.removeUser(userId);
    }
}
