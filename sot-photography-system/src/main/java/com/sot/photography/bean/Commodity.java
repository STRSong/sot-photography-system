package com.sot.photography.bean;

public class Commodity {
    /**
     * 商品Id
     */
    private Integer commodityId;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品价格
     */
    private Double commodityPrice;

    /**
     * 商品已售数量
     */
    private Integer commoditySell;

    /**
     * 商品作者
     */
    private Integer commodityAuthor;

    /**
     * 其他
     */
    private String commodityOther;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    public Commodity() {
        super();
    }

    public Commodity(Integer commodityId, String commodityName, Double commodityPrice, Integer commoditySell, Integer commodityAuthor, String commodityOther, Integer desoft) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.commoditySell = commoditySell;
        this.commodityAuthor = commodityAuthor;
        this.commodityOther = commodityOther;
        this.desoft = desoft;
    }

    public Integer getCommodityId() {
        return this.commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return this.commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Double getCommodityPrice() {
        return this.commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommoditySell() {
        return this.commoditySell;
    }

    public void setCommoditySell(Integer commoditySell) {
        this.commoditySell = commoditySell;
    }

    public Integer getCommodityAuthor() {
        return this.commodityAuthor;
    }

    public void setCommodityAuthor(Integer commodityAuthor) {
        this.commodityAuthor = commodityAuthor;
    }

    public String getCommodityOther() {
        return this.commodityOther;
    }

    public void setCommodityOther(String commodityOther) {
        this.commodityOther = commodityOther;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commoditySell=" + commoditySell +
                ", commodityAuthor=" + commodityAuthor +
                ", commodityOther='" + commodityOther + '\'' +
                ", desoft=" + desoft +
                '}';
    }
}

