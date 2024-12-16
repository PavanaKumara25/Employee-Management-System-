package com.empapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.empapp.dto.EmployeeDto;
import com.empapp.entity.EmployeeEntity;
import com.empapp.repository.EmployeeRepository;
import com.empapp.service.EmailService;
import com.empapp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/viewAddEmployee
	@RequestMapping("/viewAddEmployee")
	public String viewAddEmployeePage() {
		return "add_employee";
	}
	
//	//http://localhost:8080/addEmployee
//	@RequestMapping("/addEmployee")
//	public String addEmployee(EmployeeEntity emp,ModelMap map) {
//		employeeService.addEmployee(emp);
//		map.addAttribute("msg", "Record is saved!!!");
//		return "add_employee";
//	}

//	@RequestMapping("/addEmployee")
//	public String addEmployee(
//			@RequestParam String name,
//			@RequestParam String email,
//			@RequestParam String mobile,
//			@RequestParam int salary,
//			ModelMap map
//			)
//	{
//		EmployeeEntity emp = new EmployeeEntity();
//		emp.setName(name);
//		emp.setEmail(email);
//		emp.setMobile(mobile);
//		emp.setSalary(salary);
//		employeeService.addEmployee(emp);
//		map.addAttribute("msg","Record is Saved!!");
//		return "add_employee";
//		
//	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(EmployeeDto empDto,ModelMap map) {
		EmployeeEntity emp = new EmployeeEntity();
		emp.setName(empDto.getName());
		emp.setEmail(empDto.getEmail());
		emp.setMobile(empDto.getMobile());
		emp.setSalary(empDto.getSalary());
		employeeService.addEmployee(emp);
		emailService.sendEmail(empDto.getEmail(), "welcome", "TestMessage");
		map.addAttribute("msg","Record is Saved!!");
		return "add_employee";
		}
	
	@RequestMapping("/listEmployees")
	public String getAllEmployees(ModelMap map) {
	List<EmployeeEntity>employees=employeeService.getAllEmployees();
	map.addAttribute("employees", employees);
	return "list_employees";
	}
	
	@RequestMapping("/delete")
	public String deleteById(
			@RequestParam long id,
			ModelMap map
			) {
		employeeService.deleteEmployee(id);
		List<EmployeeEntity>employees=employeeService.getAllEmployees();
		map.addAttribute("employees", employees);
		return "list_employees";
	}
	
	@RequestMapping("/update")
	public String getEmployeeById(
			@RequestParam long id,
			ModelMap map
			) {
		Optional<EmployeeEntity> emp = employeeService.getEmployeeById(id);
		EmployeeEntity employee = emp.get();
		map.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@RequestMapping("/updateEmployee")
	public String UpdateEmployee(EmployeeDto empDto,ModelMap map) {
		EmployeeEntity emp = new EmployeeEntity();
		emp.setId(empDto.getId());
		emp.setName(empDto.getName());
		emp.setEmail(empDto.getEmail());
		emp.setMobile(empDto.getMobile());
		emp.setSalary(empDto.getSalary());
		employeeService.UpdateEmployee(emp);
		List<EmployeeEntity>employees=employeeService.getAllEmployees();
		map.addAttribute("employees", employees);
		return "list_employees";
		}
}
