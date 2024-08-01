package com.example.application.infrastructure.persistence.repo.jpa;

import com.example.application.infrastructure.persistence.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<RoleEntity,String > {
    Optional<RoleEntity> findByName(String name);
}
