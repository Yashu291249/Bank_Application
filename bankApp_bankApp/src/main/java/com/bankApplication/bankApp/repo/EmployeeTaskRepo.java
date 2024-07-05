package com.bankApplication.bankApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankApplication.bankApp.entity.EmployeeTaskEntity;

public interface EmployeeTaskRepo extends JpaRepository<EmployeeTaskEntity, Integer> {

}