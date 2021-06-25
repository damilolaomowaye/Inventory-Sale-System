package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
