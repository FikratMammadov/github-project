package com.fikrat.githubdemo.controller;

import com.fikrat.githubdemo.model.GhUser;
import com.fikrat.githubdemo.model.GhUser2;
import com.fikrat.githubdemo.model.list.GhUserList;
import com.fikrat.githubdemo.service.GhUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class GhUserController {
    private final GhUserService ghUserService;

    @GetMapping("/{username}")
    public ResponseEntity<GhUser> getUser(@PathVariable String username){
        return ResponseEntity.ok(ghUserService.getUser(username));
    }

    @GetMapping("/")
    public ResponseEntity<List<GhUser2>> getAll(@RequestHeader String accessToken){
        return ResponseEntity.ok(ghUserService.getAll(accessToken));
    }
}
