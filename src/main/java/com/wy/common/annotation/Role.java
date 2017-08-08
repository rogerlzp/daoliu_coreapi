package com.wy.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 用户角色配置（），如果不配置则不进行角色限制，如果value为空则表示只判断是否登录
 * Created by liuyw on 2015/11/17.
 */
@Target({ java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {
	/**
	 * 角色定义表达式
	 * 
	 * @return 角色定义表达式
	 */
	String value() default "";
}
