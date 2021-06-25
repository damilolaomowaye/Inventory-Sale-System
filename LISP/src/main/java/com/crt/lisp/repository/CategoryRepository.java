package com.crt.lisp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crt.lisp.entity.Category;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {


}
