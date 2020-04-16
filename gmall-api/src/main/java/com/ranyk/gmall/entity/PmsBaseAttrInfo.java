package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * 属性表(PmsBaseAttrInfo)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsBaseAttrInfo implements Serializable {
    private static final long serialVersionUID = -65083665465777148L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 属性名称
    */
    private String attrName;
    
    private Long catalog3Id;
    /**
    * 启用：1 停用：0
    */
    private String isEnabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

}