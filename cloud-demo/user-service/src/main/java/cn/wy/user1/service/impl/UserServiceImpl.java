package cn.wy.user1.service.impl;

import cn.wy.user1.entity.User;
import cn.wy.user1.mapper.UserMapper;
import cn.wy.user1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(String id) {
        return userMapper.queryById(id);
    }
}
