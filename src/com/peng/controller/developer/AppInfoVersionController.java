package com.peng.controller.developer;

import com.peng.entity.APPVersion;
import com.peng.service.developer.AppInfoVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther lovely
 * @Create 2020-02-22 10:24
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Controller
@RequestMapping(value = "appInfoVer")
public class AppInfoVersionController {
    @Autowired
    private AppInfoVersionService service;

    @RequestMapping(value = "appInformationVer")
    public String findAppInfoVer(@RequestParam(value = "appInfoId") Integer appInfoId, Model model) {
        model.addAttribute(service.findAppVersion(appInfoId));
        return "developer/appInfoVersionModify";
    }

    public String addAppVersion(APPVersion appVersion, @RequestParam(value = "multipartFile") MultipartFile multipartFile) {
        //这里要做操作
        service.addAppVersion(appVersion);
        return "";
    }
}
