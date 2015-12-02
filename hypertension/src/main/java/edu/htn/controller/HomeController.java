package edu.htn.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.htn.pojo.Comorbidity;
import edu.htn.services.ComorbidityService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/great", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	
	
	
	
	
	
	
	@Autowired  
	 ComorbidityService comorbidityService;  
	  
	 @RequestMapping("/comorbidity")  
	 public ModelAndView registerUser(@ModelAttribute Comorbidity comorbidity) {  
	  
	  List<String> sexList = new ArrayList<String>();  
	  sexList.add("male");  
	  sexList.add("female");  
	  
	  List<String> raceList = new ArrayList<String>();  
	  raceList.add("White");  
	  raceList.add("Black");
	  raceList.add("Asian");
	  raceList.add("Other");
	  
	  Map<String, List> map2 = new HashMap<String, List>();  
	  map2.put("sexList", sexList);  
	  map2.put("raceList", raceList);  
	  return new ModelAndView("comorbidity", "map", map2);  
	 }  
	
}
