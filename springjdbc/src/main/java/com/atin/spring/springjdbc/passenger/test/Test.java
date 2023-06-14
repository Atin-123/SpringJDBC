package com.atin.spring.springjdbc.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atin.spring.springjdbc.passenger.dao.PassengerDAO;
import com.atin.spring.springjdbc.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atin/spring/springjdbc/passenger/test/conf.xml");
		PassengerDAO psDao = (PassengerDAO)ctx.getBean("psDao");
		
		Passenger pass =  new Passenger();
		pass.setId(1);
		pass.setFirstName("Jatin");
		pass.setLastName("Pal");
		
//		int result = psDao.create(pass);
//		System.out.println("No of records inserted = "+ result);
		
//		int result = psDao.update(pass);
//		System.out.println("No of records updated = "+result);
		
//		Passenger passenger = psDao.read(1);
//		System.out.println(passenger);

//		int result = psDao.delete(1);
//		System.out.println("No of records deleted = "+result);
	}

}
