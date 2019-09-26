package cn.wy.server1.controller;

import cn.wy.server1.entity.User;
import cn.wy.server1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public User getUser(
            @RequestParam Map<String,String> m
            ){
        String id = m.get("id");
        User user = userService.getUserById(id);
        return user;
    }
}
