package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * (PmsBaseCatalog2)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsBaseCatalog2 implements Serializable {
    private static final long serialVersionUID = -91628078753649049L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 二级分类名称
    */
    private String name;
    /**
    * 一级分类编号
    */
    private Integer catalog1Id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

}