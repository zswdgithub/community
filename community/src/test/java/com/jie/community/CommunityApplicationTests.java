package com.jie.community;

import com.jie.community.dao.DiscussPostMapper;
import com.jie.community.dao.UserMapper;
import com.jie.community.pojo.DiscussPost;
import com.jie.community.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost post : list){
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);
    }

    @Test
    public void testSelectUserById(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

}
