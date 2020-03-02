package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther lovely
 * @Create 2020-01-10 11:56
 * @PACKAGE_NAME com.peng.entity
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DataDictionary {
    private Integer id;
    private String typeCode;
    private String typeName;
    private Integer valueId;
    private String valueName;
    private Integer createBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;

}
