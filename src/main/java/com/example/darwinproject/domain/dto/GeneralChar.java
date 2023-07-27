package com.example.darwinproject.domain.dto;

public class GeneralChar extends Base{
    private Long gnlCharId;

    private String name;
    private String descr;
    private String shrtCode;
    private GeneralStatus gnlStEntity;

    public Long getGnlCharId() {
        return gnlCharId;
    }

    public void setGnlCharId(Long gnlCharId) {
        this.gnlCharId = gnlCharId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public GeneralStatus getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GeneralStatus gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }
}
