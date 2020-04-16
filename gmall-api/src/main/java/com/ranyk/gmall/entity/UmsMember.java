package com.ranyk.gmall.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 会员表(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UmsMember implements Serializable {
    private static final long serialVersionUID = 731895660599518248L;

    /**
     * 主键，为主键添加Id注解，同时设置该主键的主键策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long memberLevelId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 手机号码
    */
    private String phone;
    /**
    * 帐号启用状态:0->禁用；1->启用
    */
    private Integer status;
    /**
    * 注册时间
    */
    private Date createTime;
    /**
    * 头像
    */
    private String icon;
    /**
    * 性别：0->未知；1->男；2->女
    */
    private Integer gender;
    /**
    * 生日
    */
    private Object birthday;
    /**
    * 所做城市
    */
    private String city;
    /**
    * 职业
    */
    private String job;
    /**
    * 个性签名
    */
    private String personalizedSignature;
    /**
    * 用户来源
    */
    private Integer sourceType;
    /**
    * 积分
    */
    private Integer integration;
    /**
    * 成长值
    */
    private Integer growth;
    /**
    * 剩余抽奖次数
    */
    private Integer luckeyCount;
    /**
    * 历史积分数量
    */
    private Integer historyIntegration;


}