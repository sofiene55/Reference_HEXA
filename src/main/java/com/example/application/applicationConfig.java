package com.example.application;

import com.example.application.application.service.RoleService;
import com.example.application.application.usecase.*;
import com.example.application.domain.repository.RoleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class applicationConfig {
    @Bean
    public RoleService roleService(GetListRolesUseCase getListRolesUseCase,
                                   SaveRoleUseCase saveRoleUseCase,
                                   GetRoleByIdUseCase getRoleByIdUseCase,
                                   GetRoleByNameUseCase getRoleByNameUseCase,
                                   UpdateRoleUseCase updateRoleUseCase,
                                   DeleteRoleByIdUseCase deleteRoleByIdUseCase){
        return new RoleService(saveRoleUseCase, getListRolesUseCase, getRoleByIdUseCase, getRoleByNameUseCase, updateRoleUseCase, deleteRoleByIdUseCase);
    }

    @Bean
    public GetListRolesUseCase getListRolesUseCase(RoleRepository roleRepository){
        return new GetListRolesUseCase(roleRepository);
    }

    @Bean
    public SaveRoleUseCase saveRoleUseCase(RoleRepository roleRepository){
        return new SaveRoleUseCase(roleRepository);
    }

    @Bean
    public GetRoleByIdUseCase getRoleByIdUseCase(RoleRepository roleRepository){
        return new GetRoleByIdUseCase(roleRepository);
    }

    @Bean
    public GetRoleByNameUseCase getRoleByNameUseCase(RoleRepository roleRepository){
        return new GetRoleByNameUseCase(roleRepository);
    }

    @Bean
    public UpdateRoleUseCase updateRoleUseCase(RoleRepository roleRepository){
        return new UpdateRoleUseCase(roleRepository);
    }

    @Bean
    public DeleteRoleByIdUseCase deleteRoleByIdUseCase(RoleRepository roleRepository){
        return new DeleteRoleByIdUseCase(roleRepository);
    }
}
