package com.example.hng_internship_backendstage_1.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    private String name;
    private String track;
}
