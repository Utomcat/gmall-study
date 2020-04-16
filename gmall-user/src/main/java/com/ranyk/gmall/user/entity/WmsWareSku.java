package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * (WmsWareSku)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:34
 */
public class WmsWareSku implements Serializable {
    private static final long serialVersionUID = 875349956419800856L;
    /**
    * 编号
    */
    private Long id;
    /**
    * skuid
    */
    private Long skuId;
    /**
    * 仓库id
    */
    private Long warehouseId;
    /**
    * 库存数
    */
    private Integer stock;
    /**
    * 存货名称
    */
    private String stockName;
    
    private Integer stockLocked;


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

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getStockLocked() {
        return stockLocked;
    }

    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

}