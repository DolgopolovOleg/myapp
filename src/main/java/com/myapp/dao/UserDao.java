package com.myapp.dao;


import com.myapp.entity.User;

import java.util.List;

public interface UserDao extends AbstractDao<User, Integer>{
    void save(User user);
    List<User> findAllUsers();
}
