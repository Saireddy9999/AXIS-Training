package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.entity.LoanApplication;

@Repository
public interface ILoanApplicationRepository extends JpaRepository<LoanApplication, Integer> { }