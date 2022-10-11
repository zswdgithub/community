package com.jie.community.dao;

import com.jie.community.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/10/2 22:46:29
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String headerUrl);

    int updatePassword(int id,String password);
}
