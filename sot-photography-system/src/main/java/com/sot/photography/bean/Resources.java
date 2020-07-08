package com.sot.photography.bean;

public class Resources {
    /**
     * 资源Id
     */
    private Integer resourcesId;

    /**
     * 资源Id
     */
    private Integer commodityId;

    /**
     * 资源名称
     */
    private String resourcesName;

    /**
     * 资源类型
     */
    private String resourcesType;

    /**
     * 资源种类
     */
    private String resourcesClass;

    /**
     * 资源地址
     */
    private String resourcesAddress;

    /**
     * 资源描述
     */
    private String resourcesDescribe;

    /**
     * 资源上传者
     */
    private String resourcesPeople;

    /**
     * 资源上传时间
     */
    private String resourcesTime;

    /**
     * 资源大小
     */
    private String resourcesSize;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    public Resources() {
        super();
    }

    public Resources(Integer resourcesId, Integer commodityId, String resourcesName, String resourcesType, String resourcesClass, String resourcesAddress, String resourcesDescribe, String resourcesPeople, String resourcesTime, String resourcesSize, Integer desoft) {
        this.resourcesId = resourcesId;
        this.commodityId = commodityId;
        this.resourcesName = resourcesName;
        this.resourcesType = resourcesType;
        this.resourcesClass = resourcesClass;
        this.resourcesAddress = resourcesAddress;
        this.resourcesDescribe = resourcesDescribe;
        this.resourcesPeople = resourcesPeople;
        this.resourcesTime = resourcesTime;
        this.resourcesSize = resourcesSize;
        this.desoft = desoft;
    }

    public Integer getResourcesId() {
        return this.resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getResourcesName() {
        return this.resourcesName;
    }

    public void setResourcesName(String resourcesName) {
        this.resourcesName = resourcesName;
    }

    public String getResourcesType() {
        return this.resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }

    public String getResourcesClass() {
        return this.resourcesClass;
    }

    public void setResourcesClass(String resourcesClass) {
        this.resourcesClass = resourcesClass;
    }

    public String getResourcesAddress() {
        return this.resourcesAddress;
    }

    public void setResourcesAddress(String resourcesAddress) {
        this.resourcesAddress = resourcesAddress;
    }

    public String getResourcesDescribe() {
        return this.resourcesDescribe;
    }

    public void setResourcesDescribe(String resourcesDescribe) {
        this.resourcesDescribe = resourcesDescribe;
    }

    public String getResourcesPeople() {
        return this.resourcesPeople;
    }

    public void setResourcesPeople(String resourcesPeople) {
        this.resourcesPeople = resourcesPeople;
    }

    public String getResourcesTime() {
        return this.resourcesTime;
    }

    public void setResourcesTime(String resourcesTime) {
        this.resourcesTime = resourcesTime;
    }

    public String getResourcesSize() {
        return this.resourcesSize;
    }

    public void setResourcesSize(String resourcesSize) {
        this.resourcesSize = resourcesSize;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "resourcesId=" + resourcesId +
                ", commodityId=" + commodityId +
                ", resourcesName='" + resourcesName + '\'' +
                ", resourcesType='" + resourcesType + '\'' +
                ", resourcesClass='" + resourcesClass + '\'' +
                ", resourcesAddress='" + resourcesAddress + '\'' +
                ", resourcesDescribe='" + resourcesDescribe + '\'' +
                ", resourcesPeople='" + resourcesPeople + '\'' +
                ", resourcesTime='" + resourcesTime + '\'' +
                ", resourcesSize='" + resourcesSize + '\'' +
                ", desoft=" + desoft +
                '}';
    }
}

