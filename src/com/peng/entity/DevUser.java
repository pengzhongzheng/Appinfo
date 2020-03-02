package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther lovely
 * @Create 2020-01-10 11:58
 * @PACKAGE_NAME com.peng.entity
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DevUser {
    private Integer id;
    private String devCode;
    private String devName;
    private String devPassword;
    private String devEmail;
    private String devInfo;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
}
