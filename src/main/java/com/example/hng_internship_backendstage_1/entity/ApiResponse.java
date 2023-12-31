package com.example.hng_internship_backendstage_1.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data public class ApiResponse {
    // format the date

    private String slack_name;
    private String current_day = LocalDateTime.now().getDayOfWeek().toString().charAt(0) + LocalDateTime.now().getDayOfWeek().toString().substring(1).toLowerCase();;
    private String utc_time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    private String track;
    private String github_file_url = "https://github.com/angeloobeta/HNG_Internship_Backend_Stage_1/blob/master/src/main/java/com/example/hng_internship_backendstage_1/HngInternshipBackendStage1Application.java";
    private String github_repo_url = "https://github.com/angeloobeta/HNG_Internship_Backend_Stage_1";
    private int status_code = 200;

}

