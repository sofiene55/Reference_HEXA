package com.example.application.infrastructure.persistence.repo;

import com.example.application.domain.model.Role;
import com.example.application.domain.repository.RoleRepository;
import com.example.application.infrastructure.persistence.mapper.RoleMapper;
import com.example.application.infrastructure.persistence.repo.jpa.RoleRepo;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoleRepoImpl implements RoleRepository {
    private final RoleRepo roleRepo;

    public RoleRepoImpl(@Lazy RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public Role save(Role role) {
        return RoleMapper.toDomain(roleRepo.save(RoleMapper.toEntity(role)));
    }

    @Override
    public List<Role> findAllRoles() {
        return roleRepo.findAll()
                .stream()
                .map(RoleMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Role> findRoleById(String id) {
            return roleRepo.findById(id)
                    .map(RoleMapper::toDomain);
    }

    @Override
    public Role updateRoleById(Role role, String id) {
        if( roleRepo.existsById(id)){
            return RoleMapper.toDomain(roleRepo.save(RoleMapper.toEntity(role)));
        }
        return null;
    }

    @Override
    public void deleteRoleById(String id) {
        roleRepo.deleteById(id);
    }


    @Override
    public Optional<Role> findRoleByName(String name) {
        return roleRepo.findByName(name).map(RoleMapper::toDomain);
    }
}
