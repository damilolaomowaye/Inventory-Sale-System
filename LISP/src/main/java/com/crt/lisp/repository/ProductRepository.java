package com.crt.lisp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.Product;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
