package cn.wy.httpdemo.mapper;

import cn.wy.httpdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    User getUserById(String id);

}
