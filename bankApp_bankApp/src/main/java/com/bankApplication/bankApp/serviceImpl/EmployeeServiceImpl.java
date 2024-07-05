package com.bankApplication.bankApp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankApplication.bankApp.Dto.EmployeeDto;
import com.bankApplication.bankApp.entity.EmployeeEntity;
import com.bankApplication.bankApp.repo.EmployeeRepo;
import com.bankApplication.bankApp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo emplrepo;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto empldto) {
		// TODO Auto-generated method stub
		EmployeeEntity savedEmplEntity = emplrepo.save(emplDtoTOEntity(empldto)); //if we try to save empldto here it will fail coz emplrepo is extended by EmployeeEntity class
		 return emplEntityToDto(savedEmplEntity);                         //now we overcome this by cnvertin emplyeedto to emplyeeEntity
		
	}
	
	private EmployeeEntity emplDtoTOEntity(EmployeeEntity savedEmplEntity) { //here we are getting empldto variables to emplentity variables, so we can use these in above function
		
	    
	    EmployeeEntity EmplEntity = new EmployeeEntity();
	    EmplEntity.setName(savedEmplEntity.getName());
	    EmplEntity.setEmailId(savedEmplEntity.getEmailId());
	    EmplEntity.setPhoneNumber(savedEmplEntity.getPhoneNumber());
	    EmplEntity.setAddress(savedEmplEntity.getAddress());
	    EmplEntity.setSalary(savedEmplEntity.getSalary());
	    return EmplEntity;
	}
	private  EmployeeEntity emplEntityToDto(EmployeeEntity emplEntity) {
		EmployeeDto EmplDto = new EmployeeDto();
		
		EmplDto.setName(emplEntity.getName());
		EmplDto.setEmailId(emplEntity.getEmailId());
		EmplDto.setAddress(emplEntity.getAddress());
		EmplDto.setPhoneNumber(emplEntity.getPhoneNumber());
		EmplDto.setSalary(emplEntity.getSalary());
		
	}
}
