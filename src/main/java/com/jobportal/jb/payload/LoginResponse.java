package com.jobportal.jb.payload;

public class LoginResponse {

    private String message;

    public LoginResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

