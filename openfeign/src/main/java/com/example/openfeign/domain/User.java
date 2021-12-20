package com.example.openfeign.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String account;
    private String password;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;
}
