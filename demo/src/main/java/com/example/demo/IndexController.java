package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:IndexController
 * Description:项目环境搭建测试
 *
 * @author ranyi
 * @date 2020-04-15 13:31
 * Version: V1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello spring boot!";
    }

}
