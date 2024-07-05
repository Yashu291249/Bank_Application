package com.bankApplication.bankApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankApplication.bankApp.Dto.EmployeeDto;
import com.bankApplication.bankApp.entity.EmployeeEntity;
import com.bankApplication.bankApp.repo.EmployeeRepo;
import com.bankApplication.bankApp.service.EmployeeService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private EmployeeService emplService;
	//Post:Create Emplooyee and details.
	@PostMapping("/register")
	public void createEmployee(@RequestBody  EmployeeDto emplDto) {
		
		
	}
}
