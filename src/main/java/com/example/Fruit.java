package com.example;

import io.micronaut.core.annotation.NonNull;
import jakarta.annotation.Nullable;

import javax.validation.constraints.NotBlank;
public class Fruit {
    @NonNull
    @NotBlank
    private final String name;

    @Nullable
    private String description;

    public Fruit(@NonNull String name,
                 @Nullable String description) {
        this.name = name;
        this.description = description;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }
}
