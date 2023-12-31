package com.atin.spring.springjdbc.jdbc.employee.dao;

import java.util.List;

import com.atin.spring.springjdbc.jdbc.employee.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();

}
