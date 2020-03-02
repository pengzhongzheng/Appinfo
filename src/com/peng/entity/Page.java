package com.peng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther lovely
 * @Create 2020-02-21 13:25
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    //每页的数量
    private Integer pageNumber;
    //在第几页
    private Integer currentPageNo;
    //总共多少数据
    private Integer totalCount;
    //总共多少页
    private Integer totalPageCount;

}
