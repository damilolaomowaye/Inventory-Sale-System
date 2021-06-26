package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.RoleLogEntity;
import com.crt.lisp.repository.RoleLogRepository;

@Transactional
@Service
public class RoleLogService {
	
	@Autowired RoleLogRepository roleLogRepository;
	
	public void insert(RoleLogEntity roleLogEntity) {
		roleLogRepository.save(roleLogEntity);
    }

    public Optional<RoleLogEntity> find(int id) {
        return roleLogRepository.findById(id);
    }

    public Iterable<RoleLogEntity> findAll() {
        return roleLogRepository.findAll();
    }

    public void updateRoleLog(RoleLogEntity roleLogEntity) {
    	roleLogRepository.save(roleLogEntity);
    }

    public void deleteRoleLog(RoleLogEntity roleLogEntity) {
    	roleLogRepository.delete(roleLogEntity);
    }

}
