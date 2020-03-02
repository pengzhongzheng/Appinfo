package com.peng.controller.developer;

import com.alibaba.fastjson.JSON;
import com.peng.entity.AppCategory;
import com.peng.service.developer.AppCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther lovely
 * @Create 2020-02-21 16:00
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Controller
@RequestMapping(value = "category")
public class AppCategoryController {
    @Autowired
    private AppCategoryService service;

    @ResponseBody
    @RequestMapping(value = "categoryList.json")
    public String category(@RequestParam(value = "pid")Integer pid){
        List<AppCategory> category = service.findCategory(pid);
        return JSON.toJSONString(category);
    }

    @ResponseBody
    @RequestMapping(value = "categoryListLeve1.json")
    public String categoryLeve1(){
        List<AppCategory> category = service.findCategoryLeve1();
        return JSON.toJSONString(category);
    }
}
