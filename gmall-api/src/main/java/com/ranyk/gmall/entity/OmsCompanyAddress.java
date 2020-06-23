package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * 公司收发货地址表(OmsCompanyAddress)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:29
 */
public class OmsCompanyAddress implements Serializable {
    private static final long serialVersionUID = -27162159111805179L;
    
    private Long id;
    /**
    * 地址名称
    */
    private String addressName;
    /**
    * 默认发货地址：0->否；1->是
    */
    private Integer sendStatus;
    /**
    * 是否默认收货地址：0->否；1->是
    */
    private Integer receiveStatus;
    /**
    * 收发货人姓名
    */
    private String name;
    /**
    * 收货人电话
    */
    private String phone;
    /**
    * 省/直辖市
    */
    private String province;
    /**
    * 市
    */
    private String city;
    /**
    * 区
    */
    private String region;
    /**
    * 详细地址
    */
    private String detailAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

}