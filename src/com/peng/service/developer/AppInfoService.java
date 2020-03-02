package com.peng.service.developer;

import com.peng.dao.developer.appInfo.AppInfoMapping;
import com.peng.entity.AppInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther lovely
 * @Create 2020-02-21 13:51
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Service
public class AppInfoService {
    @Autowired
    private AppInfoMapping infoMapping;

    public int findCount(Map<String,Object> map){
        return infoMapping.findCount(map);
    }

    public List<AppInfo> findAppInfos(Map<String,Object> map) {
        return infoMapping.findAppInfos(map);
    }


    public boolean addAppInfo(AppInfo appInfo) {
        return infoMapping.addAppInfo(appInfo) >= 1 ;
    }


    public AppInfo findAppInfo( Integer id){
        return infoMapping.findAppInfo(id);
    }


    public boolean delAppInfo(Integer id){
        return infoMapping.delAppInfo(id) >= 1;
    }

    public int updAppInfo(AppInfo appInfo){
        return infoMapping.updAppInfo(appInfo);
    }
}
