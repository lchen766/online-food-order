package com.sky.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.sky.enumeration.OperationType;

/***
 * 数据自动填充注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型: UPDATE/ INSERT
    //OperationType是一个枚举类，这是返回值类型，意味着这个参数必须是OperationType枚举类中的一个值
    //value()方法用于获取注解中指定的操作类型
    OperationType value();
    
}
