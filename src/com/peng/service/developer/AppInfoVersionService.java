package com.peng.service.developer;

import com.peng.dao.developer.appInfoVersion.AppInfoVersionMapping;
import com.peng.entity.APPVersion;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther lovely
 * @Create 2020-02-22 10:46
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Service
public class AppInfoVersionService {
    @Autowired
    private AppInfoVersionMapping mapping;

    public APPVersion findAppVersion(Integer id) {
        return mapping.findAppVersion(id);
    }

    public boolean addAppVersion(APPVersion appVersion) {
        return mapping.addAppVersionInfo(appVersion) >= 1;
    }
}
