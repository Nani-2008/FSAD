package com.klu;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class ErrorResponse {

    private String message;
    private String description;
    private String error;

    public ErrorResponse(String message, String description, String error) {
        this.message = message;
        this.description = description;
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public String getError() {
        return error;
    }
}