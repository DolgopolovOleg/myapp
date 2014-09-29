package com.myapp.service;


import com.myapp.entity.User;

public interface UserService {

    User findById(Integer id);
    void save(User user);
    void delete(Integer id);
}
