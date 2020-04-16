package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * (PmsProductSaleAttr)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsProductSaleAttr implements Serializable {
    private static final long serialVersionUID = 229897269051233518L;
    /**
    * id
    */
    private Long id;
    /**
    * 商品id
    */
    private Long productId;
    /**
    * 销售属性id
    */
    private Long saleAttrId;
    /**
    * 销售属性名称(冗余)
    */
    private String saleAttrName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

}