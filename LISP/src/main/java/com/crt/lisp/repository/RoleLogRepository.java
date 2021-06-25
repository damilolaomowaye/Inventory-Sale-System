package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.RoleLogEntity;

@Repository
public interface RoleLogRepository extends JpaRepository<RoleLogEntity, Integer> {

}
