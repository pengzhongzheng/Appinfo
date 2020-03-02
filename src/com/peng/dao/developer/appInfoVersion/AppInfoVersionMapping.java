package com.peng.dao.developer.appInfoVersion;

import com.peng.entity.APPVersion;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther lovely
 * @Create 2020-02-22 10:26
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
public interface AppInfoVersionMapping {
    APPVersion findAppVersion(@Param(value = "id")Integer id);

    int addAppVersionInfo(APPVersion appVersion);
}
