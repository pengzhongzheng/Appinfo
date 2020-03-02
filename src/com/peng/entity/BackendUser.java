package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther lovely
 * @Create 2020-01-10 11:42
 * @PACKAGE_NAME com.peng.entity
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BackendUser {
    private Integer id;
    private String userCode;
    private String username;
    private Integer userType;
    private Integer  createBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private String userPassword;
}
