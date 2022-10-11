package com.jie.community.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author mj123
 * @date 2022/10/2 11:09:47
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;  //0-普通; 1-置顶;
    private int status; //0-正常; 1-精华; 2-拉黑;
    private Date createTime;
    private int commentCount;
    private double score;
}
