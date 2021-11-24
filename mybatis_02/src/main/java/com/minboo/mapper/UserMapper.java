package com.minboo.mapper;

import com.minboo.pojo.User;

import java.util.List;

/**
 * @author hmb
 * @create 2021-11-16 16:03
 */
public interface UserMapper {

    /**
     * 查询全部用户
     * @return
     */
    List<User> selectUserList();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 添加一个用户
     * @param user
     */
    void addUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteUserById(int id);
}
