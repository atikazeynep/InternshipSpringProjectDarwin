package com.example.darwinproject.domain.dto;

import java.util.List;

public class  GeneralStatus extends Base{
    private int statusId;
    private String name;
    private String description;
    private String shortCode;
    private String entityName;
    private boolean isActive;
    private List<ProductOffer> productOffers;

    private List<ProductOfferCharValue> productOfferCharValues;

    private List<DarwinUser> users;

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<ProductOffer> getProductOffers() {
        return productOffers;
    }

    public void setProductOffers(List<ProductOffer> productOffers) {
        this.productOffers = productOffers;
    }

    public List<ProductOfferCharValue> getProductOfferCharValues() {
        return productOfferCharValues;
    }

    public void setProductOfferCharValues(List<ProductOfferCharValue> productOfferCharValues) {
        this.productOfferCharValues = productOfferCharValues;
    }

    public List<DarwinUser> getUsers() {
        return users;
    }

    public void setUsers(List<DarwinUser> users) {
        this.users = users;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
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

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
}
