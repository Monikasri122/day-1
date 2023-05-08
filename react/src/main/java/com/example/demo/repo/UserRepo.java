package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminModel;
import com.example.demo.model.UserModel;
@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
