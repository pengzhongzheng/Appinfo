package com.peng.dao.developer.category;

import com.peng.entity.AppCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther lovely
 * @Create 2020-02-21 15:54
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Component
public interface AppCategoryMapping {
    List<AppCategory> findCategory(@Param(value = "id") Integer id);

    List<AppCategory> findCategoryLeve1();
}
