package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.User;
import com.crt.lisp.repository.UserRepository;

@Transactional
@Service
public class UserService {
	
	@Autowired   public UserRepository userRepository;
	
	public void insert(User user) {
        userRepository.save(user);
    }

    public Optional<User> find(int id) {
        return userRepository.findById(id);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

}
