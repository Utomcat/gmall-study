package com.ranyk.gmall.user.service.impl;

import com.ranyk.gmall.entity.UmsMember;
import com.ranyk.gmall.entity.UmsMemberReceiveAddress;
import com.ranyk.gmall.service.UserService;
import com.ranyk.gmall.user.dao.UmsMemberMapper;
import com.ranyk.gmall.user.dao.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UserServiceImpl
 * Description:用户业务接口实现类
 *
 * @author ranyi
 * @date 2020-04-15 22:54
 * Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    /**
     * 获取所有用户的信息
     *
     * @return 返回查询到的所有的用户信息
     */
    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.selectAll();
    }

    /**
     * 根据用户ID进行获取改用户的地址信息
     *
     * @param memberId 用户Id
     * @return 返回查询到的结果
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId) {

        /*Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);
        return umsMemberReceiveAddressMapper.selectByExample(example);*/

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(Integer.toUnsignedLong(memberId));
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
