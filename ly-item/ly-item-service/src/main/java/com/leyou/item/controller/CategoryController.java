package com.leyou.item.controller;/**
 * Description:
 *
 * @author lxl
 * @date ${date} ${time}
 */

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName CategoryController
 *
 * @Author bruce
 * @Date 2021/10/13  17:47
 * Version 1.0
 **/
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /***
     *  根据父节点查询商品类目
     * @param pid
     * @return
     * */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryByParentId(@RequestParam(value = "pid", defaultValue = "0") Long pid) {
        List<Category> list = this.categoryService.queryListByParent(pid);
        if (list == null || list.size() < 1) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(list);
    }


}
