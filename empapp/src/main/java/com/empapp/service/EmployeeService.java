package com.empapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.entity.EmployeeEntity;
import com.empapp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
		
	public void addEmployee(EmployeeEntity emp) {
		employeeRepository.save(emp);
	}

	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> employees = employeeRepository.findAll();
		return employees;
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	public Optional<EmployeeEntity> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Optional<EmployeeEntity> byId = employeeRepository.findById(id);
		return byId;
		
	}

	public void UpdateEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		employeeRepository.save(emp);
		
	}
}
