package com.nimap.machinetest.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.machinetest.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	List<Product> findByCategoryId(Long categoryId);
}
