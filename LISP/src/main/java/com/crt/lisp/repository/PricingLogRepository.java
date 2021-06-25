package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.PricingLogEntity;

@Repository
public interface PricingLogRepository extends JpaRepository<PricingLogEntity,Integer>{
}
