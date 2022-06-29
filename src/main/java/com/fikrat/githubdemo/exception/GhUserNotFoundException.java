package com.fikrat.githubdemo.exception;

import lombok.Data;

@Data
public class GhUserNotFoundException extends RuntimeException {
    private String username;

    public GhUserNotFoundException(String username) {
    }
}