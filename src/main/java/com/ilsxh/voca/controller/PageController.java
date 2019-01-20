package com.ilsxh.voca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面路由
 */
@Controller
public class PageController {

    @RequestMapping(value = {"/index", "/"})
    public String index() {
        return "index";
    }

    @RequestMapping("/blogs")
    public String toBlogList() {
        return "blogs";
    }

    @RequestMapping("/blogDetail")
    public String toblogDetail() {
        return "blogDetail";
    }
}
