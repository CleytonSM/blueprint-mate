package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

public class LoginDTO {

    @NotNull(message = "Email field can't be null")
    private String email;
    @NotNull(message = "Password field can't be null")
    private String password;

    public @NotNull(message = "Email field can't be null") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email field can't be null") String email) {
        this.email = email;
    }

    public @NotNull(message = "Password field can't be null") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "Password field can't be null") String password) {
        this.password = password;
    }
}
