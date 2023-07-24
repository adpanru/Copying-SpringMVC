package com.heaboy.annotation;

import java.lang.annotation.*;


/**
 * 请求映射
 *
 * @author 小如
 * @date 2023/07/24
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface RequestMapping {
    /**
     *
     * @return
     */
    String value() default "";
}
