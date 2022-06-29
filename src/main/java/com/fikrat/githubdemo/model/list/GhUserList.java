package com.fikrat.githubdemo.model.list;

import com.fikrat.githubdemo.model.GhUser;
import jdk.dynalink.linker.LinkerServices;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GhUserList {
    private List<GhUser> users;

    public GhUserList(List<GhUser> users) {
        this.users = new ArrayList<>();
    }
}
