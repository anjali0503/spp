package com.mindgate.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.mindgate.main.domain.LoginDetails;
@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {

	private static final String GET_USER="select * from login_details where User_Id=? and  Password=?";

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public LoginDetails getUser(LoginDetails loginDetails) {
		
		LoginDetails result=jdbcTemplate.queryForObject(GET_USER, new LoginDetailsRowMapper(),loginDetails.getUserId(),loginDetails.getPassword());
		
		return result;
	}
	

	
	
}
