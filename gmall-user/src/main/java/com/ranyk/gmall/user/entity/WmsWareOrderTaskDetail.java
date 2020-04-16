package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * (WmsWareOrderTaskDetail)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:34
 */
public class WmsWareOrderTaskDetail implements Serializable {
    private static final long serialVersionUID = 799967192467935185L;
    /**
    * 编号
    */
    private Long id;
    /**
    * sku_id
    */
    private Long skuId;
    /**
    * sku名称
    */
    private String skuName;
    /**
    * 购买个数
    */
    private Integer skuNums;
    /**
    * 工作单编号
    */
    private Long taskId;
    
    private Integer skuNum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuNums() {
        return skuNums;
    }

    public void setSkuNums(Integer skuNums) {
        this.skuNums = skuNums;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

}