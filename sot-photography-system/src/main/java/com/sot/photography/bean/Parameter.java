package com.sot.photography.bean;

public class Parameter {
    /**
     * 参数Id
     */
    private Integer parameterId;

    /**
     * 参数类型
     */
    private String parameterType;

    /**
     * 参数内容
     */
    private String parameterContent;

    /**
     * 参数标识
     */
    private Integer paramaterMark;

    /**
     * 参数价格
     */
    private Double paramaterPrice;

    /**
     * 参数描述
     */
    private String paramaterDescribe;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    public Parameter() {
        super();
    }

    public Parameter(Integer parameterId, String parameterType, String parameterContent, Integer paramaterMark, Double paramaterPrice, String paramaterDescribe, Integer desoft) {
        this.parameterId = parameterId;
        this.parameterType = parameterType;
        this.parameterContent = parameterContent;
        this.paramaterMark = paramaterMark;
        this.paramaterPrice = paramaterPrice;
        this.paramaterDescribe = paramaterDescribe;
        this.desoft = desoft;
    }

    public Integer getParameterId() {
        return this.parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterType() {
        return this.parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getParameterContent() {
        return this.parameterContent;
    }

    public void setParameterContent(String parameterContent) {
        this.parameterContent = parameterContent;
    }

    public Integer getParamaterMark() {
        return this.paramaterMark;
    }

    public void setParamaterMark(Integer paramaterMark) {
        this.paramaterMark = paramaterMark;
    }

    public Double getParamaterPrice() {
        return this.paramaterPrice;
    }

    public void setParamaterPrice(Double paramaterPrice) {
        this.paramaterPrice = paramaterPrice;
    }

    public String getParamaterDescribe() {
        return this.paramaterDescribe;
    }

    public void setParamaterDescribe(String paramaterDescribe) {
        this.paramaterDescribe = paramaterDescribe;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "parameterId=" + parameterId +
                ", parameterType='" + parameterType + '\'' +
                ", parameterContent='" + parameterContent + '\'' +
                ", paramaterMark=" + paramaterMark +
                ", paramaterPrice=" + paramaterPrice +
                ", paramaterDescribe='" + paramaterDescribe + '\'' +
                ", desoft=" + desoft +
                '}';
    }
}

