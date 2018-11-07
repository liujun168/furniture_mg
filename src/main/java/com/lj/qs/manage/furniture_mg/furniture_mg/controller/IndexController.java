package com.lj.qs.manage.furniture_mg.furniture_mg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页web
 */
@Controller
//@RequestMapping("/")
public class IndexController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    private  String index(){
        return "index";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/main")
    private  String mainPage(){
        return "main";
    }

//    @RequestMapping("/manage")
//    public String login(){
//        return "manage";
//    }
}
