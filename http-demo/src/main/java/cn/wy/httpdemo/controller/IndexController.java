package cn.wy.httpdemo.controller;

import cn.wy.httpdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUser")
    public User getUser(
            @RequestParam String id
    ){
        Map<String,String> a = new HashMap<String,String>();
        a.put("id",id);
        User user = restTemplate.postForObject("http://localhost:8088/getUser",a,User.class);
        return user;
    }
}
