package com.ranyk.gmall.user.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品评价表(PmsComment)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class PmsComment implements Serializable {
    private static final long serialVersionUID = -85628242774078217L;
    
    private Long id;
    
    private Long productId;
    
    private String memberNickName;
    
    private String productName;
    /**
    * 评价星数：0->5
    */
    private Integer star;
    /**
    * 评价的ip
    */
    private String memberIp;
    
    private Date createTime;
    
    private Integer showStatus;
    /**
    * 购买时的商品属性
    */
    private String productAttribute;
    
    private Integer collectCouont;
    
    private Integer readCount;
    
    private String content;
    /**
    * 上传图片地址，以逗号隔开
    */
    private String pics;
    /**
    * 评论用户头像
    */
    private String memberIcon;
    
    private Integer replayCount;


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

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    public Integer getCollectCouont() {
        return collectCouont;
    }

    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

}