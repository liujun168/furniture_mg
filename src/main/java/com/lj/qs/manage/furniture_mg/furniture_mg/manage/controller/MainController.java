package com.lj.qs.manage.furniture_mg.furniture_mg.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理主页
 */
@Controller
@RequestMapping("/manage")
public class MainController {

    @RequestMapping("/main.html")
    private String toMainPage(){
        return "/manage/main.html";
    }
}
