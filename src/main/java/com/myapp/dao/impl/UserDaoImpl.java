package com.myapp.dao.impl;


import com.myapp.dao.UserDao;
import com.myapp.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, Integer> implements UserDao{

    protected UserDaoImpl() {
        super(User.class);
    }

    @Override
    public void save(User user) {
        saveOrUpdate(user);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}