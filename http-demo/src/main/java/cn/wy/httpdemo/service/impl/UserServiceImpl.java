package cn.wy.httpdemo.service.impl;

import cn.wy.httpdemo.entity.User;
import cn.wy.httpdemo.mapper.UserMapper;
import cn.wy.httpdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
