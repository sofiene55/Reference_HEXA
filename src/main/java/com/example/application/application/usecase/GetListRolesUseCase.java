package com.example.application.application.usecase;

import com.example.application.domain.model.Role;
import com.example.application.domain.repository.RoleRepository;

import java.util.List;

public class GetListRolesUseCase {
    private final RoleRepository roleRepository;

    public GetListRolesUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> execute (){
        return roleRepository.findAllRoles();
    }
}
