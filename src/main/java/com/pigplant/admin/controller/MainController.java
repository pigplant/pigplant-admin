package com.pigplant.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eggplant on 2018/5/27.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/pig")
    public String pig() {
        return "You're a pig!";
    }

}
