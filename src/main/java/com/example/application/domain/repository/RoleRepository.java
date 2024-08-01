package com.example.application.domain.repository;

import com.example.application.domain.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {
    Role save(Role role);

    List<Role> findAllRoles();

    Optional<Role> findRoleById(String id);

    Role updateRoleById(Role role, String id);

    void deleteRoleById(String id);
    Optional<Role> findRoleByName(String name);
}
