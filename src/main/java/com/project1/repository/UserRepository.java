package com.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUserNameAndStatus(String name, int status);
}
