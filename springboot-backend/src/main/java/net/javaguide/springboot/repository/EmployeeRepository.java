package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguide.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	// all crud database methods
	

}
