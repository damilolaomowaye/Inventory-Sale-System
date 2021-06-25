package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.PermissionLogEntity;
import com.crt.lisp.repository.PermissionLogRepository;

@Transactional
@Service
public class PermissionLogService {
	
	@Autowired PermissionLogRepository permissionLogRepository;
	
	public void insert(PermissionLogEntity permissionLogEntity) {
        permissionLogRepository.save(permissionLogEntity);
    }

    public Optional<PermissionLogEntity> find(int id) {
        return permissionLogRepository.findById(id);
    }

    public Iterable<PermissionLogEntity> findAll() {
        return permissionLogRepository.findAll();
    }

    public void updatePermissionLog(PermissionLogEntity permissionLogEntity) {
        permissionLogRepository.save(permissionLogEntity);
    }

    public void deletePermissionLog(PermissionLogEntity permissionLogEntity) {
        permissionLogRepository.delete(permissionLogEntity);
    }

}
