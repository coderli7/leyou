package com.leyou.item.service;/**
 * Description:
 *
 * @author lxl
 * @date ${date} ${time}
 */

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName CategoryService
 *
 * @Author bruce
 * @Date 2021/10/13  18:21
 * Version 1.0
 **/
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryListByParent(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        return this.categoryMapper.select(category);
    }

}
