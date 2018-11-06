package com.lj.qs.manage.furniture_mg.furniture_mg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页web
 */
@Controller
//@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index.html")
    private  String index(){
        return "index";
    }

//    @RequestMapping("/mainPage.html")
//    public String mainPage(){
//        return "main";
//    }
}
