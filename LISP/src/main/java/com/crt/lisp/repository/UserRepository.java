package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
