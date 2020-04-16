package com.ranyk.gmall.service;


import com.ranyk.gmall.entity.UmsMember;
import com.ranyk.gmall.entity.UmsMemberReceiveAddress;

import java.util.List;

/**
 * ClassName:UserService
 * Description:用户业务接口
 *
 * @author ranyi
 * @date 2020-04-15 22:54
 * Version: V1.0
 */
public interface UserService {


    /**
     * 查询所有的用户信息
     * @return 返回插叙的所有用户信息
     */
    List<UmsMember> getAllUser();

    /**
     * 根据用户ID进行获取改用户的地址信息
     * @param memberId 用户Id
     * @return 返回查询到的结果
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId);
}
