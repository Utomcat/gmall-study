package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * 一级分类表(PmsBaseCatalog1)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsBaseCatalog1 implements Serializable {
    private static final long serialVersionUID = 485269694779671420L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 分类名称
    */
    private String name;


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

}