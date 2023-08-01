package com.example.darwinproject.config;

import java.util.List;

public class GenericListResponse<T> {
    private List<T> datas;
    private String message;
    private Integer returnCode;

    public static <T> GenericListResponse<T> createSuccessResponse(List<T> datas) {
        GenericListResponse<T> genericResponse = new GenericListResponse<>();
        genericResponse.setDatas(datas);
        genericResponse.setMessage("SUCCESS");
        genericResponse.setReturnCode(200);
        return genericResponse;
    }

    public static <T> GenericListResponse<T> createFailResponse(List<T> datas) {
        GenericListResponse<T> genericResponse = new GenericListResponse<>();
        genericResponse.setDatas(datas);
        genericResponse.setMessage("FAIL");
        genericResponse.setReturnCode(500);
        return genericResponse;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }
}
