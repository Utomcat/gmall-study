package com.ranyk.gmall.user.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 支付信息表(PaymentInfo)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PaymentInfo implements Serializable {
    private static final long serialVersionUID = 781245928117968350L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 对外业务编号
    */
    private String orderSn;
    /**
    * 订单编号
    */
    private String orderId;
    /**
    * 支付宝交易编号
    */
    private String alipayTradeNo;
    /**
    * 支付金额
    */
    private Double totalAmount;
    /**
    * 交易内容
    */
    private String subject;
    /**
    * 支付状态
    */
    private String paymentStatus;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 创建时间
    */
    private Date confirmTime;
    /**
    * 回调信息
    */
    private String callbackContent;
    
    private Date callbackTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public Date getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Date callbackTime) {
        this.callbackTime = callbackTime;
    }

}