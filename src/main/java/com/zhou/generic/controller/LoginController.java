package com.zhou.generic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/login")
@Controller
public class LoginController {

    @GetMapping(value = {"/login","/"})
    public String login(Model model) {
        return "/login/index";
    }
}
