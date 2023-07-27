package com.example.darwinproject.domain.dto;

public class ProductOfferChar extends Base{
    private Long productOfferCharId;
    private GeneralChar generalChar;

    private String name;
    private String description;

    private ProductOffer productOffer;

    private String shortCode;

    private GeneralStatus generalStatus;

    public Long getProductOfferCharId() {
        return productOfferCharId;
    }

    public void setProductOfferCharId(Long productOfferCharId) {
        this.productOfferCharId = productOfferCharId;
    }

    public GeneralChar getGeneralChar() {
        return generalChar;
    }

    public void setGeneralChar(GeneralChar generalChar) {
        this.generalChar = generalChar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductOffer getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(ProductOffer productOffer) {
        this.productOffer = productOffer;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public GeneralStatus getGeneralStatus() {
        return generalStatus;
    }

    public void setGeneralStatus(GeneralStatus generalStatus) {
        this.generalStatus = generalStatus;
    }
}
