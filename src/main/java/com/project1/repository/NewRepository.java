package com.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
