package com.fikrat.githubdemo.service;

import com.fikrat.githubdemo.client.RestClient;
import com.fikrat.githubdemo.constants.GhConstants;
import com.fikrat.githubdemo.model.GhUser;
import com.fikrat.githubdemo.model.GhUser2;
import com.fikrat.githubdemo.model.list.GhUserList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GhUserService {
    public final RestClient restClient;

    public GhUser getUser(String username){
        ResponseEntity<GhUser> ghUserResponse = restClient.get(GhConstants.GH_API_BASE_URL+GhConstants.GH_API_USERS_RESOURCE+"/"+username,
                GhUser.class);

        return ghUserResponse.getBody();
    }

    public List<GhUser2> getAll(String accessToken){
        String token = "token "+accessToken;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept","application/vnd.github.v3+json");
        headers.add("Authorization",token);
        ResponseEntity<GhUser2[]> ghUsersResponse = restClient.get(GhConstants.GH_API_BASE_URL+GhConstants.GH_API_USERS_RESOURCE,
                GhUser2[].class,headers);


        return  new ArrayList<>(Arrays.asList(ghUsersResponse.getBody()));
    }

}
