package com.example.sbmmp.controller;

import com.example.sbmmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/getUser/{id}")

    public String GetUser(@PathVariable int id){
        return userService.getById(id).toString();
    }

}
