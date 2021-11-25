package com.minboo.mapper;

import com.minboo.pojo.User;

import java.util.List;

/**
 * @author hmb
 * @create 2021-11-16 16:03
 */
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);


}
