package com.jqkj.crm.setting.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/settings/qx/user/toLogin.do")
    public String toLogin(){
        System.out.println("--------------");
        return "settings/qx/user/login";
    }
}
