package com.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.model.Products;

public interface ProductRepo extends JpaRepository<Products,Integer> {

}
