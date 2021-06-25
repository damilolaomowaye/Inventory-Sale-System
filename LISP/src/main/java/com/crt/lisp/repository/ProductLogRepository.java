package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.ProductLogEntity;

@Repository
public interface ProductLogRepository extends JpaRepository<ProductLogEntity,Integer>{
}
