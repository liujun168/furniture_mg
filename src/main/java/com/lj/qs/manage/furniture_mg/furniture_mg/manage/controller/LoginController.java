package com.lj.qs.manage.furniture_mg.furniture_mg.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理端,用户登录
 */
@Controller
public class LoginController {

    @RequestMapping("/manage")
    private String gotoManageLoginPage(){
        return "redirect:/manage/login.html";
//        return "/manage/login.html";
    }

    @RequestMapping("/manage/login.html")
    private String manageLoginPage(){
        return "/manage/login.html";
    }

}
