package com.example.application.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
}
