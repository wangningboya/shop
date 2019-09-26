package cn.wy.user1.mapper;

import cn.wy.user1.entity.User;
import cn.wy.user1.utils.BaseMapper;

public interface UserMapper extends BaseMapper<User> {
    User queryById(String id);
}
