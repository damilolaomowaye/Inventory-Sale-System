package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.UserLogEntity;
import com.crt.lisp.repository.UserLogRepository;

@Transactional
@Service
public class UserLogService {
	
	@Autowired UserLogRepository userLogRepository;
	
	public void insert(UserLogEntity userLogEntity) {
        userLogRepository.save(userLogEntity);
    }

    public Optional<UserLogEntity> find(int id) {
        return userLogRepository.findById(id);
    }

    public Iterable<UserLogEntity> findAll() {
        return userLogRepository.findAll();
    }

    public void updateUserLog(UserLogEntity userLogEntity) {
        userLogRepository.save(userLogEntity);
    }

    public void deleteUserLog(UserLogEntity userLogEntity) {
        userLogRepository.delete(userLogEntity);
    }

}
