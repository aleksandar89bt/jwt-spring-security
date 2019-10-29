package com.aleksandar.jwtspringsecurity.model;

/**
 * @author Aleksandar on 28.10.2019
 */
public class AuthenticationResponse {

    private String accessToken;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
