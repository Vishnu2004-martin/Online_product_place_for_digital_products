package com.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.model.Categories;

public interface CategoriesRepo extends JpaRepository<Categories,Integer> {

}
