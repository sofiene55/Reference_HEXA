package com.example.application.application.usecase;

import com.example.application.domain.repository.RoleRepository;

public class DeleteRoleByIdUseCase {
    private final RoleRepository roleRepository;

    public DeleteRoleByIdUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void execute(String id){
        roleRepository.deleteRoleById(id);
    }

}
