package com.atin.spring.springjdbc.passenger.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.atin.spring.springjdbc.passenger.dao.PassengerDAO;
import com.atin.spring.springjdbc.passenger.dao.rowmapper.PassengerMapper;
import com.atin.spring.springjdbc.passenger.dto.Passenger;

@Component("psDao")
public class PassengerDAOImpl implements PassengerDAO {
	
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
	public int create(Passenger passenger) {
		sql = "insert into passenger values(?,?,?);";
		
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		
		return result;
	}

	@Override
	public int update(Passenger passenger) {
		sql = "update passenger set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		sql = "delete from passenger where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Passenger read(int id) {
		sql = "select * from passenger where id=?";
		
		PassengerMapper passengerMapper = new PassengerMapper();
		
		Passenger passenger = jdbcTemplate.queryForObject(sql, passengerMapper, id);
		
		return passenger;
	}

}
