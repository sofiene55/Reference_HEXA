package com.example.application.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Role {
    private String id;
    private String name;
    private String description;
    private List<String> authorities;
}
