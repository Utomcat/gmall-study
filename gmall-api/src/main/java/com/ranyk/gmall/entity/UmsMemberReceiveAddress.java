package com.ranyk.gmall.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 会员收货地址表(UmsMemberReceiveAddress)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UmsMemberReceiveAddress implements Serializable {
    private static final long serialVersionUID = -33257228759494351L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long memberId;
    /**
    * 收货人名称
    */
    private String name;
    
    private String phoneNumber;
    /**
    * 是否为默认
    */
    private Integer defaultStatus;
    /**
    * 邮政编码
    */
    private String postCode;
    /**
    * 省份/直辖市
    */
    private String province;
    /**
    * 城市
    */
    private String city;
    /**
    * 区
    */
    private String region;
    /**
    * 详细地址(街道)
    */
    private String detailAddress;

}