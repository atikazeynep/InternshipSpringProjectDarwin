package com.example.darwinproject.domain.dto;

import java.util.List;

public class GeneralType extends Base{
    int typeId;
    String name;

    String description;
    String shortCode;

    String entityCodeName;
    boolean isActive;

    private List<ProductOffer> productOffers;

    private List<DarwinUser> users;

    public GeneralType() {
    }

    public GeneralType(int typeId, String name, String description, String shortCode, String entityCodeName, boolean isActive) {
        this.typeId = typeId;
        this.name = name;
        this.description = description;
        this.shortCode = shortCode;
        this.entityCodeName = entityCodeName;
        this.isActive = isActive;
    }

    public GeneralType(int typeId) {
        this.typeId = typeId;
    }

    public List<ProductOffer> getProductOffers() {
        return productOffers;
    }

    public void setProductOffers(List<ProductOffer> productOffers) {
        this.productOffers = productOffers;
    }

    public List<DarwinUser> getUsers() {
        return users;
    }

    public void setUsers(List<DarwinUser> users) {
        this.users = users;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getEntityCodeName() {
        return entityCodeName;
    }

    public void setEntityCodeName(String entityCodeName) {
        this.entityCodeName = entityCodeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
