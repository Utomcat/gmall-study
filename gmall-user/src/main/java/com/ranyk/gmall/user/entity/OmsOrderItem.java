package com.ranyk.gmall.user.entity;

import java.io.Serializable;

/**
 * 订单中所包含的商品(OmsOrderItem)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
public class OmsOrderItem implements Serializable {
    private static final long serialVersionUID = 143411712710399470L;
    
    private Long id;
    /**
    * 订单id
    */
    private Long orderId;
    /**
    * 订单编号
    */
    private String orderSn;
    
    private Long productId;
    
    private String productPic;
    
    private String productName;
    
    private String productBrand;
    
    private String productSn;
    /**
    * 销售价格
    */
    private Double productPrice;
    /**
    * 购买数量
    */
    private Integer productQuantity;
    /**
    * 商品sku编号
    */
    private Long productSkuId;
    /**
    * 商品sku条码
    */
    private String productSkuCode;
    /**
    * 商品分类id
    */
    private Long productCategoryId;
    /**
    * 商品的销售属性
    */
    private String sp1;
    
    private String sp2;
    
    private String sp3;
    /**
    * 商品促销名称
    */
    private String promotionName;
    /**
    * 商品促销分解金额
    */
    private Double promotionAmount;
    /**
    * 优惠券优惠分解金额
    */
    private Double couponAmount;
    /**
    * 积分优惠分解金额
    */
    private Double integrationAmount;
    /**
    * 该商品经过优惠后的分解金额
    */
    private Double realAmount;
    
    private Integer giftIntegration;
    
    private Integer giftGrowth;
    /**
    * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
    */
    private String productAttr;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Double getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(Double integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public Double getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Double realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

}