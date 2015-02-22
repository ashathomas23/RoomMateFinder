package com.utd.rfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginDAO {
	
	@Autowired
	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource aDataSource) {
		this.dataSource = aDataSource;
	}
	
	public String authenticateUser(String aUsername, String aPassword) {
		System.out.println("Username ===>> "+aUsername+ ".............. Password ===>> "+aPassword);
		Connection lConnection = null;
		PreparedStatement lPreparedStatement = null;
		ResultSet lResultSet = null;
		
		try {
			lConnection = dataSource.getConnection();
			lPreparedStatement = lConnection.prepareStatement("select count(*) as count from login where username=? and password=?");
			lPreparedStatement.setString(1, aUsername);
			lPreparedStatement.setString(2, aPassword);
			lResultSet = lPreparedStatement.executeQuery();
			lResultSet.last();
			int lRowCount = lResultSet.getInt("count");
			if(lRowCount == 1) {
				return "Authenticated";
			}
			else {
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
		return null;
	}

}
