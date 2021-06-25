package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.RolePermission;
import com.crt.lisp.repository.RolePermissionRepository;

@Transactional
@Service
public class RolePermissionService {
	
	@Autowired RolePermissionRepository rolePermissionRepository;
	
	public void insert(RolePermission rolePermission) {
        rolePermissionRepository.save(rolePermission);
    }


    public Optional<RolePermission> findById(int id) {
        return rolePermissionRepository.findById(id);
    }

    public Iterable<RolePermission> findAll() {
        return rolePermissionRepository.findAll();
    }

    public void updateRolePermission(RolePermission rolePermission) {
        rolePermissionRepository.save(rolePermission);
    }

    public void deleteRolePermission(RolePermission rolePermission) {
        rolePermissionRepository.delete(rolePermission);
    }

}
