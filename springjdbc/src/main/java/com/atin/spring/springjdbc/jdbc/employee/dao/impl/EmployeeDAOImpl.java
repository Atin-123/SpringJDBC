package com.atin.spring.springjdbc.jdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.atin.spring.springjdbc.jdbc.employee.Employee;
import com.atin.spring.springjdbc.jdbc.employee.dao.EmployeeDAO;
import com.atin.spring.springjdbc.jdbc.employee.dao.rowmapper.EmployeeRowMapper;

@SuppressWarnings("unused")
@Component("employeeImpl")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		
		sql = "insert into employee values(?,?,?);";
		
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		
		return result;
	}

	@Override
	public int update(Employee employee) {
		sql = "update employee set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		sql = "Delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		sql = "select * from employee where id=?";
		
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		
		Employee emp = jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
		return emp;
	}

	@Override
	public List<Employee> read() {
		sql = "select * from employee";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee> listOfEmployee = jdbcTemplate.query(sql, employeeRowMapper);
		return listOfEmployee;
	}

}
