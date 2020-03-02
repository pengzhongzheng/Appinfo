package com.peng.controller.backstage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther lovely
 * @Create 2020-02-21 11:05
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Controller
@RequestMapping(value = "backstage")
public class BackstageController {
    @RequestMapping(value = "login")
    public String login(){
        return "backstageLogin";
    }

}
