package com.utd.rfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.utd.rfinder.beans.UserPreference;

public class PreferencesDAO {
	
	@Autowired
	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource aDataSource) {
		this.dataSource = aDataSource;
	}
	
	public UserPreference getPreference(int prefId) {
		Connection lConnection = null;
		PreparedStatement lPreparedStatement = null;
		ResultSet lResultSet = null;
		
		
		try {
			lConnection = dataSource.getConnection();
			lPreparedStatement = lConnection.prepareStatement("select * from  preferences where preference_id=?");
			lPreparedStatement.setInt(1, prefId);
			lResultSet = lPreparedStatement.executeQuery();
			lResultSet.next();
				UserPreference pref = new UserPreference();
				pref.setPreferenceId(lResultSet.getInt("Preference_Id"));
				pref.setGender(lResultSet.getString("Gender"));
				pref.setFoodPreference(lResultSet.getString("Food_Preference"));
				pref.setSmokingHabit(lResultSet.getString("Smoking_Habit"));
				pref.setRoomType(lResultSet.getString("Room_Type"));
				pref.setAlcohol(lResultSet.getString("Alcohol"));
				pref.setNoiseLevel(lResultSet.getString("Noise_level"));
				pref.setPets(lResultSet.getString("Pets"));
				pref.setAcademicMajor(lResultSet.getString("Academic_Major"));
				return pref;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
		return null;
	}

}
