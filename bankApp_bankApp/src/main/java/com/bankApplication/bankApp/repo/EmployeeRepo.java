package com.bankApplication.bankApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankApplication.bankApp.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}
 