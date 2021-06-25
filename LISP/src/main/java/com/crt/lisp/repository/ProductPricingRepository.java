package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.ProductPricing;

@Repository
public interface ProductPricingRepository extends JpaRepository<ProductPricing,Integer>{
}
