package com.utd.rfinder;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utd.rfinder.dao.LoginDAO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	LoginDAO loginDAO;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Login", locale);
		return "Login";
	}
	
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public String signOff(Locale locale, Model model, HttpSession session) {
		logger.info("sign out", locale);
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String loginUser(Model model, HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String loginUser(@Validated String username, @Validated String password, Model model, HttpServletRequest request) {
		//System.out.println("C ID ==="+clientId + "........."+ password + "........." + role);
		HttpSession session = request.getSession();
		
		String lUser = loginDAO.authenticateUser(username, password);
		if(lUser != null) {
			model.addAttribute("user", lUser );
			session.setAttribute("user", lUser);
			return "HomePage";
		} else {
			model.addAttribute("errStr", "Please enter correct Username and Password" );
			return "Login";
		}
	}
	
}
