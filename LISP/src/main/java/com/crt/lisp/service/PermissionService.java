package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.Permission;
import com.crt.lisp.repository.PermissionRepository;

@Transactional
@Service
public class PermissionService {
	
	@Autowired PermissionRepository permissionRepository;
	
	public void insert(Permission permission) {
        permissionRepository.save(permission);
    }

    public Optional<Permission> find(int id) {
        return permissionRepository.findById(id);
    }

    public Iterable<Permission> findAll() {
        return permissionRepository.findAll();
    }

    public void updatePermission(Permission permission) {
        permissionRepository.save(permission);
    }

    public void deletePermission(Permission permission) {
        permissionRepository.delete(permission);
    }

}
