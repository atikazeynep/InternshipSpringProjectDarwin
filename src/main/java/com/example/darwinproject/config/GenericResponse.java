package com.example.darwinproject.config;

public class GenericResponse<T> {

    private T data;
    private String message;
    private Integer returnCode;

    public static <T> GenericResponse<T> createSuccessResponse(T data) {
        GenericResponse<T> genericResponse = new GenericResponse<>();
        genericResponse.setData(data);
        genericResponse.setMessage("SUCCESS");
        genericResponse.setReturnCode(200);
        return genericResponse;
    }

    public static <T> GenericResponse<T> createFailResponse(T data) {
        GenericResponse<T> genericResponse = new GenericResponse<>();
        genericResponse.setData(data);
        genericResponse.setMessage("FAIL");
        genericResponse.setReturnCode(500);
        return genericResponse;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
