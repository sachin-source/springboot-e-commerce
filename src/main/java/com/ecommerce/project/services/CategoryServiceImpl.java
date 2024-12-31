package com.ecommerce.project.services;

import com.ecommerce.project.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public void createCategory(Category category) {
        categories.add(category);
    }
}
