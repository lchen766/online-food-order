package com.sky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;

@Mapper
public interface DishFlavorMapper {

    /**
     * 新增
     */
    //@AutoFill(value = OperationType.INSERT)
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除对应的口味
     * @param id
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
    
    /**
     * 根据菜品id集合批量删除对应口味
     */
    void deleteByDishIds(List<Long> ids);

    /**
     * 根据菜品id查询对应口味
     * @param dishId
     * @return
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
