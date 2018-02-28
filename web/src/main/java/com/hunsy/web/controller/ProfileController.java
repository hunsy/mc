package com.hunsy.web.controller;

import com.hunsy.metadata.entity.UcUser;
import com.hunsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 个人中心
 *
 * @author hunsy
 * @date 2018/2/22
 */
@Controller
@RequestMapping(value = "/admin/profile")
public class ProfileController {


    @Autowired
    private UserService userService;

    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "info/{id}")
    public String info(@PathVariable("id") String id, Model model) {

        UcUser user = userService.findOne(id);
        model.addAttribute("user", user);
        return "/admin/profile/info";
    }


}
