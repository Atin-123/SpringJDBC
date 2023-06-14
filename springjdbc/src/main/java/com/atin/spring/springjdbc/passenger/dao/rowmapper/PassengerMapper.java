package com.atin.spring.springjdbc.passenger.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atin.spring.springjdbc.passenger.dto.Passenger;

public class PassengerMapper implements RowMapper<Passenger>{

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger ps = new Passenger();
		ps.setId(rs.getInt(1));
		ps.setFirstName(rs.getString(2));
		ps.setLastName(rs.getString(3));
		
		return ps;
	}

}
