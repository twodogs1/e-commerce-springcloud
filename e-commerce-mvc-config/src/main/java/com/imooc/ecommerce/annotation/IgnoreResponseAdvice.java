package com.imooc.ecommerce.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略统一响应注解定义
 *
 * @author JiangZhou
 * @date 2022/6/30 19:53
 */
@Target({ElementType.TYPE,ElementType.METHOD}) //用于标识注解的生效范围
@Retention(RetentionPolicy.RUNTIME) //用于标识存在时期，比如源文件，运行时
public @interface IgnoreResponseAdvice {

}
