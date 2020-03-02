package com.peng.service.developer;

import com.peng.dao.developer.user.DeveloperUserMapping;
import com.peng.entity.DevUser;
import com.peng.exception.LoginException;
import com.peng.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @Auther lovely
 * @Create 2020-02-09 9:37
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Service
public class DeveloperUserService {
    @Autowired
    private DeveloperUserMapping devUserMapping;

    public String findCode(String code) throws NotFoundException {
        try {
            return devUserMapping.findUserByCode(code);
        } catch (SQLException e) {
            throw new NotFoundException("账号不存在");
        }
    }

    public DevUser login(String userCode, String passWord) throws LoginException {
            return devUserMapping.findUser(userCode, passWord);
    }
}
