package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @Auther lovely
 * @Create 2020-01-10 11:51
 * @PACKAGE_NAME com.peng.entity
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class APPVersion {
    private Integer id;
    private Integer appId;
    private String versionNo;
    private String versionInfo;
    private Integer publishStatus;
    private String downloadLink;
    private Double versionSize;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private String apkLocPath;
    private String apkFileName;
    private String appName;
}
