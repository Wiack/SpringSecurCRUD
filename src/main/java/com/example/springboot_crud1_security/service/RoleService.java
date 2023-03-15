package com.example.springboot_crud1_security.service;

import com.example.springboot_crud1_security.model.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);

    List<Role> findAll();

    public boolean containsRole(final List<Role> list, final String name);
}
