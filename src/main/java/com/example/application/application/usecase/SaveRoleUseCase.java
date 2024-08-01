package com.example.application.application.usecase;

import com.example.application.domain.model.Role;
import com.example.application.domain.repository.RoleRepository;

public class SaveRoleUseCase {
    private final RoleRepository roleRepository;

    public SaveRoleUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role execute(Role role){
        return roleRepository.save(role);
    }
}
