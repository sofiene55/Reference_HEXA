package com.example.application.application.usecase;

import com.example.application.domain.model.Role;
import com.example.application.domain.repository.RoleRepository;

public class GetRoleByIdUseCase {
    private final RoleRepository roleRepository;

    public GetRoleByIdUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role execute(String id){
        return roleRepository.findRoleById(id).get();
    }
}
