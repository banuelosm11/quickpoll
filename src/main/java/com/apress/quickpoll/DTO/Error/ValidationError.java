package com.apress.quickpoll.DTO.Error;

/**
 * Created by aurorabanuelos on 6/21/17.
 */
public class ValidationError {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
