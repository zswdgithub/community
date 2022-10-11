package com.jie.community.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.community.dao.DiscussPostMapper;
import com.jie.community.pojo.DiscussPost;
import com.jie.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/10/2 16:24:26
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Override
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }

    @Override
    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }


}
