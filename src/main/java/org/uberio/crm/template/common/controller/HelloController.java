package org.uberio.crm.template.common.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HelloController {
    
	/**
	 * Returns a ModelAndView object that encapsulates both - view and a model (data) 
	 * binded to the view.
	 * @RequestMapping("/") annotation maps the return result of this method to an index page of the app
	 * 
	 * @return      ModelAndView object that encapsulates a specific view - home.jsp and a Model object 
	 *              that contains greetingMsg passed binded to a view 
	 */
    @RequestMapping("/")
    public ModelAndView index() {
    	ModelAndView mav = new ModelAndView("home");
    	mav.addObject("greetingMsg", "This is our greeting message");
        return mav;
    }
    
    /**
	 * Returns a String
	 * @RequestMapping("/HelloWorld") annotation maps the return result of this method to /HelloWorld page of the app
	 *
	 * @return      String
	 */
    @RequestMapping("/HelloWorld")
    public String getLapster() {
        return "This is Hello World page!";
    }
}