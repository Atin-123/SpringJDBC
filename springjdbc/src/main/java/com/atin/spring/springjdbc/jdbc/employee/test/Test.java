package com.atin.spring.springjdbc.jdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atin.spring.springjdbc.jdbc.employee.Employee;
import com.atin.spring.springjdbc.jdbc.employee.dao.EmployeeDAO;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atin/spring/springjdbc/jdbc/employee/test/conf.xml");
		
//		Employee employee = new Employee();
//		employee.setId(3);
//		employee.setFirstName("Raima");
//		employee.setLastName("Sen");
		
		Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Adrija");
		employee.setLastName("Paul");
		
		
		EmployeeDAO employeeDAOImpl = (EmployeeDAO) ctx.getBean("employeeImpl");
		
//		int result = employeeDAOImpl.create(employee);
//		System.out.println("No of records inserted is : "+result)  ;
		
//		int result = employeeDAOImpl.update(employee);
//		System.out.println("No of rows updated: "+result);
		
//		int result = employeeDAOImpl.delete(3);
//		System.out.println("No of rows deleted: "+result);
		
		Employee emp = employeeDAOImpl.read(1);
		System.out.println(emp);
		
		List<Employee> listOfEmployee = employeeDAOImpl.read();
		
		for(Employee em: listOfEmployee) {
			System.out.println(em);
		}
	}

}
