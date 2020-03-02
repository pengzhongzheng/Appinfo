package com.peng.dao.developer.user;

import com.peng.entity.DevUser;
import com.peng.exception.LoginException;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * @Auther lovely
 * @Create 2020-02-21 11:23
 * @PACKAGE_NAME
 * @Description
 */
@Component
public interface DeveloperUserMapping {
    /**
     * 检查code是否存在
     * @param code
     * @return
     */
    public String findUserByCode(@Param(value = "code") String code)throws SQLException;

    /**
     * 登录操作
     * @param code
     * @param password
     * @return
     */
    public DevUser findUser(@Param(value = "code") String code, @Param(value = "password")String password) ;
}
