package com.jie.community.controller;

import com.jie.community.pojo.DiscussPost;
import com.jie.community.pojo.Page;
import com.jie.community.pojo.User;
import com.jie.community.service.DiscussPostService;
import com.jie.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/30 09:11:17
 */
@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    @Autowired
    private DiscussPostService discussPostService;

    @GetMapping("/index")
    public String getIndexPage(Model model, Page page){
        page.setRows(discussPostService.findDiscussPostRows(0));
        page.setPath("/index");

        List<DiscussPost> list = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String,Object>> discussPosts = new ArrayList<>();
        if (list != null){
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();
                map.put("post",post);
                User user = userService.findUserById(post.getUserId());
                map.put("user",user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts",discussPosts);
        return "index";
    }
}
