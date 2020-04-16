package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * 商品图片表(PmsProductImage)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsProductImage implements Serializable {
    private static final long serialVersionUID = 776029013946202604L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 商品id
    */
    private Long productId;
    /**
    * 图片名称
    */
    private String imgName;
    /**
    * 图片路径
    */
    private String imgUrl;


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

}