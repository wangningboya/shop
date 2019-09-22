package cn.wy.httpdemo.controller;

import cn.wy.httpdemo.entity.User;
import cn.wy.httpdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(
            @RequestParam String id
    ){
        User user = userService.getUserById(id);
        return user;
    }
}
