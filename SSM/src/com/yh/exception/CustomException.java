package com.yh.exception;

public class CustomException extends Exception {

    //异常信息属性
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomException(String message){
        this.message=message;
    }

}
