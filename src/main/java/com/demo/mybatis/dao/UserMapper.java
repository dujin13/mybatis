package com.demo.mybatis.dao;

import com.demo.mybatis.po.User;

import java.util.List;

public interface UserMapper {
    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User queryUserById(Long id);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<User> queryUserAll();

    /**
     * 新增用户
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据id删除用户信息
     *
     * @param id
     */
    void deleteUserById(Long id);
}
