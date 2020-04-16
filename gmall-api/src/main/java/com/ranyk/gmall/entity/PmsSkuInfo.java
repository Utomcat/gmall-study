package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * 库存单元表(PmsSkuInfo)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsSkuInfo implements Serializable {
    private static final long serialVersionUID = -10909002476028569L;
    /**
    * 库存id(itemID)
    */
    private Long id;
    /**
    * 商品id
    */
    private Long productId;
    /**
    * 价格
    */
    private Object price;
    /**
    * sku名称
    */
    private String skuName;
    /**
    * 商品规格描述
    */
    private String skuDesc;
    
    private Object weight;
    /**
    * 品牌(冗余)
    */
    private Long tmId;
    /**
    * 三级分类id（冗余)
    */
    private Long catalog3Id;
    /**
    * 默认显示图片(冗余)
    */
    private String skuDefaultImg;


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

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

}