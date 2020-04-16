package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * (PmsBaseCatalog3)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsBaseCatalog3 implements Serializable {
    private static final long serialVersionUID = 118075941029231644L;
    /**
    * 编号
    */
    private Long id;
    /**
    * 三级分类名称
    */
    private String name;
    /**
    * 二级分类编号
    */
    private Long catalog2Id;


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

    public Long getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

}