package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

public class LoginDTO {

    @NotNull(message = "Email field can't be null")
    private String email;
    @NotNull(message = "Password field can't be null")
    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
