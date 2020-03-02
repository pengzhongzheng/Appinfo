package com.peng.dao.developer.appInfo;

import com.peng.entity.AppInfo;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther lovely
 * @Create 2020-02-21 13:42
 * @PACKAGE_NAME
 * @Description
 */
@Component
public interface AppInfoMapping {
    int findCount(Map<String,Object> map);

    List<AppInfo> findAppInfos(Map<String,Object> map);

    int addAppInfo(AppInfo appInfo);


    AppInfo findAppInfo(@Param(value = "id") Integer id);


    int delAppInfo(@Param(value = "id") Integer id);

    int updAppInfo(AppInfo appInfo);

}
