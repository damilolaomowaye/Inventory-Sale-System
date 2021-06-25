package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.Category;
import com.crt.lisp.repository.CategoryRepository;

/**
 * @Author Oluwadamilola on 24-06-2021.
 */


@Transactional
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void insert(Category category) {
        categoryRepository.save(category);
    }


    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void updateCategory(Category category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(Category category) {

        categoryRepository.delete(category);
    }


}
