package com.example.sbmmp.service.imp;

import com.example.sbmmp.dao.UserDao;
import com.example.sbmmp.entity.User;
import com.example.sbmmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao ;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }
}
