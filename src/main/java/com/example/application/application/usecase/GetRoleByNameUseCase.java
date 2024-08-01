package com.example.application.application.usecase;

import com.example.application.domain.model.Role;
import com.example.application.domain.repository.RoleRepository;

public class GetRoleByNameUseCase {
    private final RoleRepository roleRepository;

    public GetRoleByNameUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role execute(String name){ return roleRepository.findRoleByName(name).get(); }
}
