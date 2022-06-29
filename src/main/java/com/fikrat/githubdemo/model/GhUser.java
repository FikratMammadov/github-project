package com.fikrat.githubdemo.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
//import com.fikrat.githubdemo.model.enums.UserType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GhUser{
    private String login;
    private Long id;
    private String nodeId;
    private String avatarUrl;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationUrls;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;
    private String name;
    private Company company;
    private String blog;
    private String location;
    private String email;
    private Boolean hireable;
    private String bio;
    private String twitterUsername;
    private Long publicRepos;
    private Long publicGists;
    private Long followers;
    private Long following;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
