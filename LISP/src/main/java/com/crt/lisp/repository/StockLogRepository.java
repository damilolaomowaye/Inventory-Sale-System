package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.StockLogEntity;

@Repository
public interface StockLogRepository extends JpaRepository<StockLogEntity,Integer>{
}
