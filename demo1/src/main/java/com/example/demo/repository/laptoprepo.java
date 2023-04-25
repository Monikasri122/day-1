package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.laptop.laptop;


@Repository
public interface laptoprepo extends JpaRepository<laptop, Integer> {

}
