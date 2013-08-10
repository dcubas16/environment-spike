package org.environment.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.environment.entities.Employee;

@Transactional(propagation = Propagation.REQUIRED)
public interface EmployeeDAO {

	public Long createEmployee(Employee emp);
	
	public Employee getEmployeeById(Long id);
}
