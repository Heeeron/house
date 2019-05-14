package com.learn.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 系统日志注解
 *
 */
@Target(ElementType.METHOD)		//注解被用于什么地方
@Retention(RetentionPolicy.RUNTIME)		//注解在什么范围内有效
@Documented		//用于生成javaDoc文档
public @interface SysLog {

	String value() default "";
}
