package org.uberio.crm.template.service;

import org.uberio.crm.template.quote.bo.QuoteCalculator;
import org.uberio.crm.template.quote.model.Quote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.uberio.crm.template.Application;



@RestController
public class CalcV2 {
	

	@RequestMapping("/calcV2")
	public Quote getLapster(@RequestParam(value="subtractedAmt", required=false, defaultValue="0.0") double subtractedAmt, 
							@RequestParam(value="addAmt", required=false, defaultValue="0.0") double addAmt) {
		try{
			QuoteCalculator qc = new QuoteCalculator();			
			
			Application.log.info("calcv2 from Application");
			
		    return qc.calculateQuote(subtractedAmt - addAmt);
		} catch (Exception ex) {
			System.out.println("Smth went wrong");
			return new Quote();
		}
	}
	
}
