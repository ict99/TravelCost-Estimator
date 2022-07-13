package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.model.TravelBean;

//use appropriate annotation to configure BillController as Controller
public class BillController {
	
	//invoke the service class - estimateTransportationCost method.	
	public String estimateTransportationCost(@ModelAttribute("travel") TravelBean travelBean, 
			ModelMap model) {
		
		return null;
	}
	
	
	
	
}
	 	  	    	    	     	      	 	
