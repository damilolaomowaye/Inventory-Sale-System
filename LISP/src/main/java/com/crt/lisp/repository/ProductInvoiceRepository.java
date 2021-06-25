package com.crt.lisp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.ProductInvoice;

@Repository
public interface ProductInvoiceRepository extends JpaRepository<ProductInvoice,Integer>{
}
