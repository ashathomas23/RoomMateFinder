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
import com.utd.rfinder.dao.LoginDAO;
import com.utd.rfinder.dao.PreferencesDAO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class PreferencesController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	PreferencesDAO prefDAO;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/preferences", method = RequestMethod.GET)
	public String getPreference(Locale locale, Model model) {
		logger.info("pref");
		
		UserPreference userPref = prefDAO.getPreference(3);
		model.addAttribute("Id",userPref.getPreferenceId());
		
		return "Preferences";
	}

	
}
