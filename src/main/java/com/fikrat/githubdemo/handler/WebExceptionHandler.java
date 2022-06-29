package com.fikrat.githubdemo.handler;

import com.fikrat.githubdemo.constants.Messages;
import com.fikrat.githubdemo.dto.exception.ExceptionResponse;
import com.fikrat.githubdemo.exception.GhUserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler(GhUserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handleGhUserNotFound(GhUserNotFoundException ex){
        return ExceptionResponse.builder()
                .message(String.format(Messages.GH_USER_NOT_FOUND_MSG_FORMAT,ex.getUsername()))
                .build();
    }

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handleGhUserNotFound(HttpClientErrorException ex){
        return ExceptionResponse.builder()
                .message(Messages.GH_USER_NOT_FOUND_MSG_FORMAT)
                .build();
    }


}
