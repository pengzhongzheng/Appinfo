package com.peng.service.developer;

import com.peng.dao.developer.category.AppCategoryMapping;
import com.peng.entity.AppCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther lovely
 * @Create 2020-02-21 16:02
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
@Service
public class AppCategoryService {
    @Autowired
    private AppCategoryMapping mapping ;
    public List<AppCategory> findCategory(Integer id) {
        return mapping.findCategory(id);
    }

    public List<AppCategory> findCategoryLeve1() {
        return mapping.findCategoryLeve1();
    }
}
