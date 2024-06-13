package com.justchill.example.models;

import lombok.Builder;

public class JwdResponse {
    private String jwtToken;
    private String username;

    // Private constructor to enforce the use of the builder
    private JwdResponse(Builder builder) {
        this.jwtToken = builder.jwtToken;
        this.username = builder.username;
    }

    // Static inner Builder class
    public static class Builder {
        private String jwtToken;
        private String username;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public JwdResponse build() {
            return new JwdResponse(this);
        }
    }

    // Static builder method to initiate the builder
    public static Builder builder() {
        return new Builder();
    }

    // Getters
    public String getJwtToken() {
        return jwtToken;
    }

    public String getUsername() {
        return username;
    }
}

