package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther lovely
 * @Create 2020-01-10 11:32
 * @PACKAGE_NAME com.peng.entity
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AppCategory {
    private Integer id;
    private String categoryCode;
    private String categoryName;
    private Integer parentId;
    private Integer createdBy;
    private Date creationTime;
    private Integer modifyBy;
    private Date modifyDate;

}
