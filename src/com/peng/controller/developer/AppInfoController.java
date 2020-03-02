package com.peng.controller.developer;

import com.alibaba.fastjson.JSON;
import com.peng.entity.AppInfo;
import com.peng.entity.Page;
import com.peng.service.developer.AppInfoService;
import com.peng.tool.PageUtil;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther lovely
 * @Create 2020-02-21 13:23
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Controller
@RequestMapping(value = "appInfo")
public class AppInfoController {

    @Autowired
    private AppInfoService service;


    @RequestMapping(value = "list")
    public String appInfoList(@RequestParam(required = false)AppInfo appInfo,
                              @RequestParam(value = "currentPageNo",required = false) Integer currentPageNo,
                              Model model) {
        Map<String,Object> map = new HashMap<String,Object>();
        fillMap(map, appInfo);
        Page page = PageUtil.getPage(currentPageNo,service.findCount(map), 5);
        map.put("index", currentPageNo);
        map.put("pageNumber", 5);
        List<AppInfo> appInfos = service.findAppInfos(map);
        model.addAttribute("appInfo", appInfo);
        model.addAttribute("pages", page);
        return "developer/developerList";
    }

    @RequestMapping(value = "add")
    public String add(AppInfo appInfo, @RequestParam(value = "multipart") MultipartFile multipartFile,
                      ServletRequest request) throws IOException {
        String filePath = request.getServletContext().getContextPath() + "/upload/appInfo/";
        String fileName = multipartFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf('.'));
        String newFileName = appInfo.getAPKName() + LocalDateTime.now() + suffix;
        File file = new File(filePath, newFileName);
        multipartFile.transferTo(file);
        //这里还要做操作 数据保存的 地址
        return "redirect:appInfo/list";
    }

    @RequestMapping(value = "/appInformation/{id}")
    public String appInformation(@PathVariable Integer id, Model model) {
        AppInfo appinfo = service.findAppInfo(id);
        model.addAttribute(appinfo);
        return "developer/appInfoView";
    }

    /*删除*/
    @RequestMapping(value = "appInfoDel.json")
    public String appInfoDel(@RequestParam(value = "id") Integer id) {
        return JSON.toJSONString(service.delAppInfo(id));
    }


    @RequestMapping(value = "appInfoModify")
    public String appInfoModify(@RequestParam(value = "id")Integer id, Model model) {
        model.addAttribute("appInfo", service.findAppInfo(id));
        return "developer/appInfoModify";
    }


    public String appInfoModifySave(AppInfo appInfo) {
        service.updAppInfo(appInfo);
        return "";
    }


    public void fillMap(Map<String, Object> map,AppInfo appInfo) {
        if (appInfo == null) {
            return;
        }
        map.put("softWareName", appInfo.getSoftWareName());
        map.put("categoryLevel1", appInfo.getCategoryLeve11());
        map.put("categoryLevel2", appInfo.getCategoryLeve12());
        map.put("categoryLevel3", appInfo.getCategoryLeve13());
        map.put("status", appInfo.getStatus());
        map.put("flatformId", appInfo.getFlatformId());
    }


}
