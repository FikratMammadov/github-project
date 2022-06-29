package com.fikrat.githubdemo.dto.exception;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse {
    private String message;
}
