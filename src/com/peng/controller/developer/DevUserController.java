package com.peng.controller.developer;

import com.peng.entity.DevUser;
import com.peng.exception.LoginException;
import com.peng.service.developer.DeveloperUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Auther lovely
 * @Create 2020-02-21 11:20
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Controller
@RequestMapping("devUser")
public class DevUserController {

    /*
    @RequestParam(value = "",required = false)

    */
    @Autowired
    private DeveloperUserService service;

    @RequestMapping(value = "doLogin")
    public String doLogin(@RequestParam(value = "devCode", required = true) String devCode, @RequestParam(value =
            "devPassword",
            required = true) String userPassword, HttpSession session) throws LoginException {
        DevUser user = service.login(devCode, userPassword);
        session.setAttribute("devUserSession", user);
        return "redirect:developer/developerFrame";
    }

    @RequestMapping(value = "logout")
    public String userOut(HttpSession session) {
        session.removeAttribute("devUserSession");
        return "redirect:developer/login";
    }
}
