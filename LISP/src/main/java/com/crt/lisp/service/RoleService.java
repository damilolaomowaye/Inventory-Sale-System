package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.Role;
import com.crt.lisp.repository.RoleRepository;

@Transactional
@Service
public class RoleService {
	
	@Autowired RoleRepository roleRepository;
	
	public void insert(Role role) {
        roleRepository.save(role);
    }

    public Optional<Role> find(int id) {
        return roleRepository.findById(id);
    }

    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    public void deleteRole(Role role) {
        roleRepository.delete(role);
    }

}
