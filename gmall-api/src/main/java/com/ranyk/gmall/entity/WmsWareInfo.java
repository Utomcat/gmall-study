package com.ranyk.gmall.entity;

import java.io.Serializable;

/**
 * (WmsWareInfo)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:34
 */
public class WmsWareInfo implements Serializable {
    private static final long serialVersionUID = -96570839752932730L;
    
    private Long id;
    
    private String name;
    
    private String address;
    
    private String areacode;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}