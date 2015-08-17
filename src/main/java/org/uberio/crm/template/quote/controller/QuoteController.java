package org.uberio.crm.template.quote.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.uberio.crm.template.quote.exception.QuoteNotFoundException;
import org.uberio.crm.template.quote.exception.QuotesNotFoundException;
import org.uberio.crm.template.quote.model.Quote;
import org.uberio.crm.template.quote.model.Quotes;


@RestController
public class QuoteController {
	
	Map<String, Quote> qtsMap;
	
	public QuoteController() {
		
		initialize();
	}
	
	/**
	 * initializes the initial parts of the class
	 */
	private void initialize() {
		
		qtsMap = new HashMap<String, Quote>();
		for (int i = 0; i < 5 ; i++) {
			qtsMap.put("qt" + i, new Quote("qt" + i, 10 - i));
		}
	}
	
	/**
	 * Returns a Json String which is a result of automatic parsing done by spring framework
	 * @RequestMapping("/quotes") annotation maps the return result of this method to /quotes page of the app
	 *
	 * @return      Quotes object that is a wrapper for a Map of quotes
	*/
	@RequestMapping("/quotes")
	public Quotes getQuotes() {
		
		if(qtsMap == null || qtsMap.size() == 0) throw new QuotesNotFoundException("1", "There are no Quotes in the system !");
		return new Quotes(qtsMap);
		
	}
	
	/**
	 * Returns a Json String which is a result of automatic parsing done by spring framework
	 * @RequestMapping("/quote/{id}") annotation maps the return result of this method to /quote/{id} page of the app
	 * 
	 * @param 		String id is an id of the specific quote, @PathVariable annotation states that a parameter is a part of URL
	 * @return      Quote object
	*/
	@RequestMapping(value = "/quote/{id}", method=RequestMethod.GET)
	public Quote getQuote(@PathVariable String id) {
		
		if(qtsMap.get(id) == null) throw new QuoteNotFoundException("2", "No such Quote !");// 
		
		return qtsMap.get(id);
	}
}
