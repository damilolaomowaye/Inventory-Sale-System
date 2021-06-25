package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.CategoryLogEntity;

@Repository
public interface CategoryLogRepository extends JpaRepository<CategoryLogEntity,Integer> {

}
