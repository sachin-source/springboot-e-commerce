package com.ecommerce.project.services;

import com.ecommerce.project.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);
}
