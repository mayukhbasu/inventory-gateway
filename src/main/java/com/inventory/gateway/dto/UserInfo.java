package com.inventory.gateway.dto;

public class UserInfo {
    private String name;
    private String email;
    private String googleId; // Field for Google ID

    // Default constructor
    public UserInfo() {
    }

    // Constructor with parameters
    public UserInfo(String name, String email, String googleId) {
        this.name = name;
        this.email = email;
        this.googleId = googleId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for Google ID
    public String getGoogleId() {
        return googleId;
    }

    // Setter for Google ID
    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }
}
