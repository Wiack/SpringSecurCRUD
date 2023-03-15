package com.example.springboot_crud1_security.service;

import com.example.springboot_crud1_security.model.Role;
import com.example.springboot_crud1_security.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public boolean containsRole(final List<Role> list, final String name){
        return list.stream().map(Role::getName).filter(name::equals).findFirst().isPresent();
    }
}
