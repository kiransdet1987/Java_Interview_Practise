package com.in28minutes.primitiveDataTypes;

import java.math.BigDecimal;

public class SImpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public SImpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	
	public BigDecimal calculateTotalValue(int noOfYears) {
		// TotalValue = principal+principal*interest*noOfYears;
		//4500+4500*7.5/100*5;
		
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
		
	}
	
	
}
