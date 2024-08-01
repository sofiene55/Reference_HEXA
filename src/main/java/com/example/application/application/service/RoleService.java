package com.example.application.application.service;

import com.example.application.application.usecase.*;
import com.example.application.domain.model.Role;

import java.util.List;

public class RoleService {
    private final SaveRoleUseCase saveRoleUseCase;
    private final GetListRolesUseCase getListRolesUseCase;
    private final GetRoleByIdUseCase getRoleByIdUseCase;

    private final GetRoleByNameUseCase getRoleByNameUseCase;

    private final UpdateRoleUseCase updateRoleUseCase;

    private final DeleteRoleByIdUseCase deleteRoleByIdUseCase;

    public RoleService(SaveRoleUseCase saveRoleUseCase, GetListRolesUseCase getListRolesUseCase, GetRoleByIdUseCase getRoleByIdUseCase, GetRoleByNameUseCase getRoleByNameUseCase, UpdateRoleUseCase updateRoleUseCase, DeleteRoleByIdUseCase deleteRoleByIdUseCase) {
        this.saveRoleUseCase = saveRoleUseCase;
        this.getListRolesUseCase = getListRolesUseCase;
        this.getRoleByIdUseCase = getRoleByIdUseCase;
        this.getRoleByNameUseCase = getRoleByNameUseCase;
        this.updateRoleUseCase = updateRoleUseCase;
        this.deleteRoleByIdUseCase = deleteRoleByIdUseCase;
    }

    public Role saveRole(Role role){
        return saveRoleUseCase.execute(role);
    }

    public List<Role> getListRoles(){
        return getListRolesUseCase.execute();
    }

    public Role getRoleById(String id){ return getRoleByIdUseCase.execute(id); }

    public Role getRoleByName(String name){ return getRoleByNameUseCase.execute(name); }

    public Role updateRole(String id, Role role){ return updateRoleUseCase.execute(id, role); }

    public void deleteRoleById(String id){ deleteRoleByIdUseCase.execute(id); }
}
