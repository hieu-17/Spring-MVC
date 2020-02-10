package com.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
