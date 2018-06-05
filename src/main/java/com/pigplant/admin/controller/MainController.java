package com.pigplant.admin.controller;

import com.pigplant.admin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pigplant.admin.mapper.UserMapper;

/**
 * Created by eggplant on 2018/5/27.
 */
@RestController
public class MainController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/login")
    public String login(@RequestParam ()) {

    }

    @RequestMapping("/pig")
    public String pig(@RequestParam String name) {

        // TODO 换json

        User user =  userMapper.getByName(name);
        if(user == null) {
            return "cannot find user -> " + name;
        } else {
            return user.toString();
        }
    }

    @RequestMapping("/checkUser")
    public String checkUser(@RequestParam String name, String passwd) {
        User user = userMapper.getByName(name);

        // TODO 换json
        if(user == null) {
            return "cannot find usser -> " + name;
        } else if(!user.getPasswd().equals(passwd)) {
            return "passwd err";
        } else {
            return "";
        }
        //return userMapper.getByName(name).toString();

        //return "You're a pig" + name;
    }

}
