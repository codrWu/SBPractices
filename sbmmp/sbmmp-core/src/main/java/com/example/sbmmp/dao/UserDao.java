package com.example.sbmmp.dao;

import com.example.sbmmp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface UserDao {
    User getById(@Param("id") Integer id);
}
