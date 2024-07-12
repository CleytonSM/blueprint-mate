package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DescendantsCreateDTO {

    @NotBlank(message = "Descendants Name field can't be null")
    private String name;
    @NotNull(message = "Descendants Age field can't be null")
    private int age;

    public DescendantsCreateDTO() {
    }

    public DescendantsCreateDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
