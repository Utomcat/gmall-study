package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * 库存单元图片表(PmsSkuImage)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsSkuImage implements Serializable {
    private static final long serialVersionUID = -71494578277946611L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 商品id
    */
    private Long skuId;
    /**
    * 图片名称（冗余）
    */
    private String imgName;
    /**
    * 图片路径(冗余)
    */
    private String imgUrl;
    /**
    * 商品图片id
    */
    private Long productImgId;
    /**
    * 是否默认
    */
    private String isDefault;


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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

}