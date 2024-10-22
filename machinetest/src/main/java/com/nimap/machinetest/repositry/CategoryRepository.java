package com.nimap.machinetest.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.machinetest.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
