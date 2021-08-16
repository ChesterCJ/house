package com.tuying.mapper;

import com.tuying.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/8/16
 */
@Mapper
public interface UsersMapper {

    /**
     * 查询所有的用户
     * @return
     */
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userId", column = "user_id", id = true),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "age", column = "age")
    })
    List<Users> listUsers();

    /**
     * 根据用户id查询用户
     * @param userId
     * @return
     */
    @Results({
            @Result(property = "userId", column = "user_id", id = true),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT * FROM users WHERE user_id = #{userId}")
    Users getUserById(@Param("userId") Long userId);

    /**
     * 新增用户
     * @param user
     */
    @Insert("INSERT INTO users(user_name, age) VALUES(#{userName}, #{age})")
    void saveUser(Users user);


    /**
     * 更新
     * @param user
     */
    @Update("UPDATE users SET user_name=#{userName}, age=#{age} WHERE user_id=#{userId}")
    void updateUser(Users user);


    /**
     * 删除用户
     * @param userId
     */
    @Delete("DELETE FROM users WHERE user_id=#{userId}")
    void removeUser(@Param("userId") Long userId);

}
