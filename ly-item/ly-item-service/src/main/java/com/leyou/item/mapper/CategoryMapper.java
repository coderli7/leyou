package com.leyou.item.mapper;/**
 * Description:
 *
 * @author lxl
 * @date ${date} ${time}
 */

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName CategoryMapper
 *
 * @Author bruce
 * @Date 2021/10/13  18:17
 * Version 1.0
 **/
@MapperScan
public interface CategoryMapper extends Mapper<Category> {

}
