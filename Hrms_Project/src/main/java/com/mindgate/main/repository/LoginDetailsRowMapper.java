package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.LoginDetails;

public class LoginDetailsRowMapper  implements RowMapper<LoginDetails>{

	@Override
	public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		int loginId=rs.getInt("LOGIN_ID");
		String userId=rs.getString("USER_ID");
		String password=rs.getString("PASSWORD");
		String designation=rs.getString("DESIGNATION");
		
		LoginDetails loginDetails=new LoginDetails(loginId, password, userId, designation);
		return loginDetails;
	}





}
