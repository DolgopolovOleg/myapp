package com.myapp.service;


import com.myapp.entity.User;
import org.hibernate.criterion.Criterion;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    void save(User user);
    void delete(Integer id);
    List<User> findAllUsers();
}
