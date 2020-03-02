package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @PackgeName: com.peng.entity
 * @ClassName: AppInfo
 * @Author: 20573
 * Date: 2020/1/8 16:45
 * project name: project
 * @Version:
 * @Description: 应用信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AppInfo {
    private Integer id;
    private String softWareName;    //应用名称
    private String APKName;
    private String supportROM;
    private String interfaceLanguage;
    private double softWareSize;
    private Date updateDate;
    private int devId;  //开发者id
    private String appInfo ;    //应用信息
    private int status;     //状态信息1审核通过，2审核不通过
    private Date onSaleDate;    //上架信息
    private Date offSaleDate;   //下架时期
    private int flatformId;     //所属平台
    private int categoryLeve13; //三级分类
    private int downloads;      //下载量
    private int createdBy;      //创建人id
    private Date creationDate;   //创建时间
    private int modifyBy;       //更改人id
    private Date modifyDate;    //更新时间
    private int categoryLeve11; //一级分类
    private int categoryLeve12; //二级分类
    private String categoryLevel1Name;
    private String categoryLevel2Name;
    private String categoryLevel3Name;
    private String logPicPath;  //图片
    private String logLocPath;
    private int versionId;      //版本id


}
