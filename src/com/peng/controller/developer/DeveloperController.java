package com.peng.controller.developer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther lovely
 * @Create 2020-02-21 11:18
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Controller
@RequestMapping(value = "developer")
public class DeveloperController {
    @RequestMapping(value = "login")
    public String login() {
        return "developmentLogin";
    }

    @RequestMapping(value = "/doLogin")
    public String doLogin(){
        return "forward:/devUser/doLogin";
    }
}
