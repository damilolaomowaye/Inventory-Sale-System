package com.crt.lisp.repository;

import org.springframework.data.repository.CrudRepository;

import com.crt.lisp.entity.Stock;

public interface StockRepository extends CrudRepository<Stock,Integer> {
}
