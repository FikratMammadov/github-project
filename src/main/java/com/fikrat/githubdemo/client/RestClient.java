package com.fikrat.githubdemo.client;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface RestClient {
    <T> ResponseEntity<T> get(String url, Class<T> type);
    <T> ResponseEntity<T> get(String url, Class<T> type, HttpHeaders headers);
    <T> ResponseEntity<T> get(String url, Class<T> type, Map<String, ?> params);
    <T> ResponseEntity<T> get(String url, Class<T> type, HttpHeaders headers, Map<String, ?> params);


    <T> ResponseEntity<T> post(String url, Object request, Class<T> type);
    <T> ResponseEntity<T> post(String url, Object request, Class<T> type, HttpHeaders headers);

    <T> ResponseEntity<T> delete(String url, Class<T> type);
    <T> ResponseEntity<T> delete(String url, Class<T> type, HttpHeaders headers);

    <T> ResponseEntity<T> put(String url, Object request, Class<T> type);
    <T> ResponseEntity<T> put(String url, Object request, Class<T> type, HttpHeaders headers);
}
