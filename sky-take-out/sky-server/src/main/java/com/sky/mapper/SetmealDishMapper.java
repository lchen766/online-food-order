package com.sky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据当前的菜品id搜索套餐id
     * @param dishIds
     * @return
     */
    
    // @Select("select setmeal_id from setmeal_dish where id in #{ids}")
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
