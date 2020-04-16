package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * (PmsProductInfo)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsProductInfo implements Serializable {
    private static final long serialVersionUID = -42220965395923313L;
    /**
    * 商品id
    */
    private Long id;
    /**
    * 商品名称
    */
    private String productName;
    /**
    * 商品描述(后台简述）
    */
    private String description;
    /**
    * 三级分类id
    */
    private Long catalog3Id;
    /**
    * 品牌id
    */
    private Long tmId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

}