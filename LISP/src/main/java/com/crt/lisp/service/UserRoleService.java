package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.UserRole;
import com.crt.lisp.repository.UserRoleRepository;

@Transactional
@Service
public class UserRoleService {
	
	@Autowired UserRoleRepository userRoleRepository;
	
	
	public void insert(UserRole userRole) {
        userRoleRepository.save(userRole);
    }


    public Optional<UserRole> findById(int id) {
        return userRoleRepository.findById(id);
    }

    public Iterable<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    public void updateUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    public void deleteUserRole(UserRole userRole) {
        userRoleRepository.delete(userRole);
    }

}
