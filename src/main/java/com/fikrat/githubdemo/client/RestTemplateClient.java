package com.fikrat.githubdemo.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class RestTemplateClient implements RestClient {
    private final RestTemplate restTemplate;

    @Override
    public <T> ResponseEntity<T> get(String url, Class<T> type) {
        return get(url, type, new HttpHeaders(), new HashMap<>());
    }


    @Override
    public <T> ResponseEntity<T> get(String url, Class<T> type, HttpHeaders headers) {
        return get(url, type, headers, new HashMap<>());
    }

    @Override
    public <T> ResponseEntity<T> get(String url, Class<T> type, Map<String, ?> params) {
        return get(url, type, new HttpHeaders(), params);
    }

    @Override
    public <T> ResponseEntity<T> get(String url, Class<T> type, HttpHeaders headers, Map<String, ?> params) {
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, type, params);
    }

    @Override
    public <T> ResponseEntity<T> post(String url, Object request, Class<T> type) {
        return post(url, request, type, new HttpHeaders());
    }

    @Override
    public <T> ResponseEntity<T> post(String url, Object request, Class<T> type, HttpHeaders headers) {
        HttpEntity<Object> requestEntity = new HttpEntity<>(request, headers);
        return restTemplate.postForEntity(url, requestEntity, type);
    }

    @Override
    public <T> ResponseEntity<T> delete(String url, Class<T> type) {
        return delete(url, type, new HttpHeaders());
    }

    @Override
    public <T> ResponseEntity<T> delete(String url, Class<T> type, HttpHeaders headers) {
        HttpEntity<Void> request = new HttpEntity<>(headers);
        return restTemplate.exchange(url, HttpMethod.DELETE, request, type);
    }

    @Override
    public <T> ResponseEntity<T> put(String url, Object request, Class<T> type) {
        return put(url, request, type, new HttpHeaders());
    }

    @Override
    public <T> ResponseEntity<T> put(String url, Object request, Class<T> type, HttpHeaders headers) {
        HttpEntity<Object> requestEntity = new HttpEntity<>(request, headers);
        return restTemplate.exchange(url, HttpMethod.PUT, requestEntity, type);
    }
}