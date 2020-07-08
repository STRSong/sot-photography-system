package com.sot.photography.bean;

public class Commodityinfo {
    /**
     * 商品详情Id
     */
    private Integer commodityInfoId;

    /**
     * 商品Id
     */
    private Integer commondityId;

    /**
     * 商品数据类型
     */
    private String commodityDataType;

    /**
     * 商品数据
     */
    private String commondityData;

    /**
     * 商品数据描述
     */
    private String commodityDescribe;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    public Commodityinfo() {
        super();
    }

    public Commodityinfo(Integer commodityInfoId, Integer commondityId, String commodityDataType, String commondityData, String commodityDescribe, Integer desoft) {
        this.commodityInfoId = commodityInfoId;
        this.commondityId = commondityId;
        this.commodityDataType = commodityDataType;
        this.commondityData = commondityData;
        this.commodityDescribe = commodityDescribe;
        this.desoft = desoft;
    }

    public Integer getCommodityInfoId() {
        return this.commodityInfoId;
    }

    public void setCommodityInfoId(Integer commodityInfoId) {
        this.commodityInfoId = commodityInfoId;
    }

    public Integer getCommondityId() {
        return this.commondityId;
    }

    public void setCommondityId(Integer commondityId) {
        this.commondityId = commondityId;
    }

    public String getCommodityDataType() {
        return this.commodityDataType;
    }

    public void setCommodityDataType(String commodityDataType) {
        this.commodityDataType = commodityDataType;
    }

    public String getCommondityData() {
        return this.commondityData;
    }

    public void setCommondityData(String commondityData) {
        this.commondityData = commondityData;
    }

    public String getCommodityDescribe() {
        return this.commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    @Override
    public String toString() {
        return "Commodityinfo{" +
                "commodityInfoId=" + commodityInfoId +
                ", commondityId=" + commondityId +
                ", commodityDataType='" + commodityDataType + '\'' +
                ", commondityData='" + commondityData + '\'' +
                ", commodityDescribe='" + commodityDescribe + '\'' +
                ", desoft=" + desoft +
                '}';
    }
}

