package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.SupplierLogEntity;

@Repository
public interface SupplierLogRepository extends JpaRepository<SupplierLogEntity,Integer>{
}
