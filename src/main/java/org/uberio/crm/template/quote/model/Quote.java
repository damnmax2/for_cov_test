package org.uberio.crm.template.quote.model;



public class Quote {
	
	private String id;
	private double amt;
	
	public Quote() {

	}
	
	public Quote(String id, double amt) {
		this.id = id;
		this.amt = amt;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getAmt() {
		return amt;
	}
	
	public void setAmt(double amt) {
		this.amt = amt;
	}
}
