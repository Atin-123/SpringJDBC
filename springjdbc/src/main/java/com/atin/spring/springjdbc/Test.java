package com.atin.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atin/spring/springjdbc/config.xml");
		JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = template.update(sql,new Integer(1), "Atindra", "Pal");
		System.out.println("No of records inserted is: "+result);
	}

}
