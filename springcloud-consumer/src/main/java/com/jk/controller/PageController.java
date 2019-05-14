package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    //查询
    @RequestMapping("show")
    public String pagequery(){

        return "usershow";
    }

    //新增
    @RequestMapping("add")
    public String addquery(){

        return "addshow";
    }





}
