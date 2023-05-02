package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.laptop.loginpg;

@Repository
public interface loginrepo extends JpaRepository<loginpg, Integer> {
	loginpg findByUsername(String username);
}
