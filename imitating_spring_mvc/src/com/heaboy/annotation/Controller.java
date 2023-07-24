package com.heaboy.annotation;

import javax.xml.ws.RequestWrapper;
import java.lang.annotation.*;


/**
 * 控制器
 *
 * @author 小如
 * @date 2023/07/24
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @ interface Controller {
}
