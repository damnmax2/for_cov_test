package org.uberio.crm.template.quote.bo;

import org.apache.log4j.Logger;
import org.uberio.crm.template.Application;
import org.uberio.crm.template.quote.model.Quote;

public class QuoteCalculator {
	
	public static final Logger log = Logger.getLogger(QuoteCalculator.class);

	public Quote calculateQuote(double subtractedAmt) {
		
		log.info("QuoteCalculator");
		Quote qt = new Quote("qt1", 25.0 - subtractedAmt);
		return qt;
	}
	
	
}
