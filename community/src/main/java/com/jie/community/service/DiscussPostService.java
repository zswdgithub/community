package com.jie.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.community.pojo.DiscussPost;

import java.util.List;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/10/2 16:24:13
 */
public interface DiscussPostService {
    public List<DiscussPost> findDiscussPosts(int userId,int offset, int limit);

    public int findDiscussPostRows(int userId);
}
