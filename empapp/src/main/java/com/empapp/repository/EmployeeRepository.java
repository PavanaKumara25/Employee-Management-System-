package com.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empapp.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
