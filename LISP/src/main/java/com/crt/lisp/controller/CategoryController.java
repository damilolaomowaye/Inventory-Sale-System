package com.crt.lisp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crt.lisp.entity.Category;
import com.crt.lisp.entity.TheLogConverter;
import com.crt.lisp.service.CategoryLogService;
import com.crt.lisp.service.CategoryService;

import java.util.Optional;

/**
 * @Author Oluwadamilola on 24-06-2021.
 */


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;
    @Autowired
    private CategoryLogService categoryLogService;

    @RequestMapping("")
    public Iterable<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Category> searchCategory(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addCategory(@RequestBody Category category) {
        categoryService.insert(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCategory(@RequestBody Category category) {
        categoryService.deleteCategory(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }


}
