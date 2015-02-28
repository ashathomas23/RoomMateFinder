package com.utd.rfinder;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utd.rfinder.beans.UserPreference;
import com.utd.rfinder.beans.UserProfile;
import com.utd.rfinder.dao.LoginDAO;
import com.utd.rfinder.dao.PreferencesDAO;
import com.utd.rfinder.dao.UserDetailDAO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class PreferencesController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UserDetailDAO userDAO;
	@Autowired
	PreferencesDAO prefDAO;
	
	
	
	@RequestMapping(value = "/preferences", method = RequestMethod.GET)
	public String getPreference(Locale locale, Model model) {
		logger.info("pref");
		
		int prefId = userDAO.getPreferenceId("ash");
		//model.addAttribute("FirstId",prefId);
		
		if(prefId !=-1)
		{

			UserPreference uPref = prefDAO.getPreference(prefId);
			
			model.addAttribute("Id",uPref.getPreferenceId());
			model.addAttribute("Gender",uPref.getGender());
			model.addAttribute("FoodPref",uPref.getFoodPreference());
			model.addAttribute("SmokingHabit",uPref.getSmokingHabit());
			model.addAttribute("RoomType",uPref.getRoomType());
			model.addAttribute("Acohol",uPref.getAlcohol());
			model.addAttribute("NoiseLevel",uPref.getNoiseLevel());
			model.addAttribute("Pets",uPref.getPets());
			model.addAttribute("AcademicMajor",uPref.getAcademicMajor());
			
		}
	
		return "Preferences";
	}

	
}
