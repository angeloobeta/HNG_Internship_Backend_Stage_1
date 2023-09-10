package com.example.hng_internship_backendstage_1.controller;

import com.example.hng_internship_backendstage_1.entity.ApiResponse;
import com.example.hng_internship_backendstage_1.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserDetail {
    @GetMapping("/api")
    public ApiResponse getDetailByNameAndTrack(
            @RequestParam(name = "slack_name") String userName,
            @RequestParam(name = "track") String track
            )
            {
        ApiResponse response = new ApiResponse();
        response.setTrack(track);
        response.setSlack_name(userName);
        response.getGithub_file_url();
        response.getGithub_repo_url();
        response.getCurrent_day();
        response.getStatus_code();
        return response;
    }
}
