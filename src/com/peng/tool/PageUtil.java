package com.peng.tool;

import com.peng.entity.Page;

/**
 * @Auther lovely
 * @Create 2020-02-21 13:25
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
public class PageUtil {
    public static Page getPage(int currentPageNo,int totalCount,int pageNumber){
        Page page = new Page();
        page.setCurrentPageNo(currentPageNo);
        page.setTotalCount(totalCount);
        page.setPageNumber(pageNumber);
        int mo = page.getTotalCount() % page.getPageNumber();
        int totalPage = mo==0?mo:page.getTotalCount() / page.getPageNumber()+1;
        page.setTotalPageCount(totalPage);
        return page;
    }
}
