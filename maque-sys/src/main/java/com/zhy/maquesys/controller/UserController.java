package com.zhy.maquesys.controller;

import com.zhy.maquesys.model.User;
import com.zhy.maquesys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/**
 * @author zhangyu
 * @date 2020/6/18 3:36 下午
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/getUser")
    public String getUserById(@RequestParam("id") String id, Model model) {
        Optional<User> user = userService.getUserById(id);
        user.ifPresent(u -> model.addAttribute("user", u));
        return "user_list";
    }
}
