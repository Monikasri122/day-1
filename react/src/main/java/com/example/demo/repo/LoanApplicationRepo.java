package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.LoanApplicstionModel;
@Repository


public interface LoanApplicationRepo extends JpaRepository<LoanApplicstionModel, Integer> {

}
