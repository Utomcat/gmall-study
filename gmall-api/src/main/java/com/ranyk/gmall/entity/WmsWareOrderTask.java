package com.ranyk.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 库存工作单表 库存工作单表(WmsWareOrderTask)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:34
 */
public class WmsWareOrderTask implements Serializable {
    private static final long serialVersionUID = 199420290311632263L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 订单编号
    */
    private Long orderId;
    /**
    * 收货人
    */
    private String consignee;
    /**
    * 收货人电话
    */
    private String consigneeTel;
    /**
    * 送货地址
    */
    private String deliveryAddress;
    /**
    * 订单备注
    */
    private String orderComment;
    /**
    * 付款方式 1:在线付款 2:货到付款
    */
    private String paymentWay;
    
    private String taskStatus;
    /**
    * 订单描述
    */
    private String orderBody;
    /**
    * 物流单号
    */
    private String trackingNo;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 仓库编号
    */
    private Long wareId;
    /**
    * 工作单备注
    */
    private String taskComment;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getOrderBody() {
        return orderBody;
    }

    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

}