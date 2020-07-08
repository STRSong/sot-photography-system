package com.sot.photography.bean;

public class Commodityparameter {
    /**
     * 商品参数id
     */
    private Integer commodityParameterId;

    /**
     * 商品Id
     */
    private Integer commodityId;

    /**
     * 服装
     */
    private Integer clothing;

    /**
     * 妆容
     */
    private Integer makeup;

    /**
     * 头饰
     */
    private Integer headdress;

    /**
     * 拍摄方式
     */
    private Integer shootingStyle;

    /**
     * 取景
     */
    private Integer view;

    /**
     * 风格类型
     */
    private Integer style;

    /**
     * 摄影师
     */
    private Integer photographer;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    public Commodityparameter() {
        super();
    }

    public Commodityparameter(Integer commodityParameterId, Integer commodityId, Integer clothing, Integer makeup, Integer headdress, Integer shootingStyle, Integer view, Integer style, Integer photographer, Integer desoft) {
        this.commodityParameterId = commodityParameterId;
        this.commodityId = commodityId;
        this.clothing = clothing;
        this.makeup = makeup;
        this.headdress = headdress;
        this.shootingStyle = shootingStyle;
        this.view = view;
        this.style = style;
        this.photographer = photographer;
        this.desoft = desoft;
    }

    public Integer getCommodityParameterId() {
        return this.commodityParameterId;
    }

    public void setCommodityParameterId(Integer commodityParameterId) {
        this.commodityParameterId = commodityParameterId;
    }

    public Integer getCommodityId() {
        return this.commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getClothing() {
        return this.clothing;
    }

    public void setClothing(Integer clothing) {
        this.clothing = clothing;
    }

    public Integer getMakeup() {
        return this.makeup;
    }

    public void setMakeup(Integer makeup) {
        this.makeup = makeup;
    }

    public Integer getHeaddress() {
        return this.headdress;
    }

    public void setHeaddress(Integer headdress) {
        this.headdress = headdress;
    }

    public Integer getShootingStyle() {
        return this.shootingStyle;
    }

    public void setShootingStyle(Integer shootingStyle) {
        this.shootingStyle = shootingStyle;
    }

    public Integer getView() {
        return this.view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getStyle() {
        return this.style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getPhotographer() {
        return this.photographer;
    }

    public void setPhotographer(Integer photographer) {
        this.photographer = photographer;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    @Override
    public String toString() {
        return "Commodityparameter{" +
                "commodityParameterId=" + commodityParameterId +
                ", commodityId=" + commodityId +
                ", clothing=" + clothing +
                ", makeup=" + makeup +
                ", headdress=" + headdress +
                ", shootingStyle=" + shootingStyle +
                ", view=" + view +
                ", style=" + style +
                ", photographer=" + photographer +
                ", desoft=" + desoft +
                '}';
    }
}

