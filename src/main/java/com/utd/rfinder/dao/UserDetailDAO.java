package com.utd.rfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;


public class UserDetailDAO {
	
	@Autowired
	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource aDataSource) {
		this.dataSource = aDataSource;
	}
	
	public int getPreferenceId(String userName) {
		Connection lConnection = null;
		PreparedStatement lPreparedStatement = null;
		ResultSet lResultSet = null;
		
		
		try {
			lConnection = dataSource.getConnection();
			lPreparedStatement = lConnection.prepareStatement("select preference_id from  user_profile where username=?");
			lPreparedStatement.setString(1, userName);
			lResultSet = lPreparedStatement.executeQuery();
			lResultSet.next();
			
			int preferenceId = lResultSet.getInt("Preference_Id");
			return preferenceId;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
		return -1;
	}



}
