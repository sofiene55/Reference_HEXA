package com.example.application.application.usecase;

import com.example.application.domain.model.Role;
import com.example.application.domain.repository.RoleRepository;

public class UpdateRoleUseCase {
    private final RoleRepository roleRepository;

    public UpdateRoleUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role execute(String id, Role role){ return roleRepository.updateRoleById(role, id); }
}
