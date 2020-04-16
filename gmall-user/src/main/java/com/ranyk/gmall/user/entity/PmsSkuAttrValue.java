package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * sku平台属性值关联表(PmsSkuAttrValue)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsSkuAttrValue implements Serializable {
    private static final long serialVersionUID = 550371758696450151L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 属性id（冗余)
    */
    private Long attrId;
    /**
    * 属性值id
    */
    private Long valueId;
    /**
    * skuid
    */
    private Long skuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}