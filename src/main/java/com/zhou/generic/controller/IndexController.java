package com.zhou.generic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class IndexController {
    @GetMapping(value = {"/","/index"})
    public String index(Model model) {
        return "index";
    }

    @GetMapping(value = "/invoice")
    public String typography(Model model) {
        return "invoice";
    }




}
