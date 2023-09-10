package com.example.hng_internship_backendstage_1.controller;

import com.example.hng_internship_backendstage_1.entity.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class User {
    @GetMapping("/")
    public ApiResponse getDetailByNameAndTrack(
            @RequestParam(name = "userName") String userName,
            @RequestParam(name = "track") String track){
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
