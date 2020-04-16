package com.ranyk.gmall.user.controller;

import com.ranyk.gmall.user.entity.UmsMember;
import com.ranyk.gmall.user.entity.UmsMemberReceiveAddress;
import com.ranyk.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName:UserController
 * Description:用户请求分发控制层
 *
 * @author ranyi
 * @date 2020-04-15 22:53
 * Version: V1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 默认请期初页面
     * @return 返回对应的首页名称，此处此时是返回一个字符串
     */
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "User Hello";
    }

    /**
     * 查询所有的用户
     * @return 返回查询结果
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    /**
     * 查询所有的用户
     * @return 返回查询结果
     */
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId){
        return userService.getReceiveAddressByMemberId(memberId);
    }

}
