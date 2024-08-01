package com.example.application.web.controller;

import com.example.application.application.service.RoleService;
import com.example.application.domain.model.Role;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> getListRoles(){
        return roleService.getListRoles();
    }

    @PostMapping("/addRole")
    public Role saveRole(@RequestBody Role role){
        return roleService.saveRole(role);
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable String id){
        return roleService.getRoleById(id);
    }

    @GetMapping("/role/{name}")
    public Role getRoleByName(@PathVariable String name){
        return roleService.getRoleByName(name);
    }

    @DeleteMapping("/deleteRole/{id}")
    public void deleteRoleById(@RequestParam String id){
        roleService.deleteRoleById(id);
    }

    @PutMapping("/updateRole/{id}")
    public Role updateRole(@RequestBody Role role, @PathVariable String id){
        return roleService.updateRole(id, role);
    }
}
