package com.jie.community.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.community.pojo.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/10/2 16:18:34
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    // @Param注解用于给参数取别名，
    // 如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);



}
