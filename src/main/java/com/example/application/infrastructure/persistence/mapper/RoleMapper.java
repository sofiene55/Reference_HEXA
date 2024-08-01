package com.example.application.infrastructure.persistence.mapper;

import com.example.application.domain.model.Role;
import com.example.application.infrastructure.persistence.entity.RoleEntity;

import static java.util.Objects.requireNonNull;

public class RoleMapper {
    public static Role toDomain(RoleEntity roleEntity){
        requireNonNull(roleEntity, "role entity should not be null!");
        return Role.builder()
                .id(roleEntity.getId())
                .name(roleEntity.getName())
                .description(roleEntity.getDescription())
                .authorities(roleEntity.getAuthorities())
                .build();
    }
    public static RoleEntity toEntity(Role role){
        requireNonNull(role, "role model should not be null!");
        return RoleEntity.builder()
                .id(role.getId())
                .name(role.getName())
                .description(role.getDescription())
                .authorities(role.getAuthorities())
                .build();
    }


}
