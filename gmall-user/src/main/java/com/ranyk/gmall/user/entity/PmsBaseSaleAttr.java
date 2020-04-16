package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * (PmsBaseSaleAttr)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsBaseSaleAttr implements Serializable {
    private static final long serialVersionUID = -38371401552613180L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 销售属性名称
    */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}