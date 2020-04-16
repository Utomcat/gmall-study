package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * 属性值表(PmsBaseAttrValue)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsBaseAttrValue implements Serializable {
    private static final long serialVersionUID = 233371638722990293L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 属性值名称
    */
    private String valueName;
    /**
    * 属性id
    */
    private Long attrId;
    /**
    * 启用：1 停用：0 1
    */
    private String isEnabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

}