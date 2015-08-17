package org.uberio.crm.template.quote.exception;



public class QuotesNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	 
	private String errCode;
	private String errMsg;
 
	public String getErrCode() {
		return errCode;
	}
 
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
 
	public String getErrMsg() {
		return errMsg;
	}
 
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
 
	public QuotesNotFoundException(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
}
