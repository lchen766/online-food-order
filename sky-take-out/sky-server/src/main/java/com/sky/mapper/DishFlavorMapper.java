package com.sky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sky.annotation.AutoFill;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;

@Mapper
public interface DishFlavorMapper {

    /**
     * 新增
     */
    @AutoFill(value = OperationType.INSERT)
    void insertBatch(List<DishFlavor> flavors);
    
}
