package com.heaboy.Controller;

import com.heaboy.annotation.Controller;
import com.heaboy.annotation.RequestMapping;

/**
 * 测试控制器
 *
 * @author 小如
 * @date 2023/07/24
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public  String index(){
        System.out.println("test->index");
        return "";
    }
    @RequestMapping("index1")
    public  String index1(){
        System.out.println("test->index1");
        return "";
    }
}
