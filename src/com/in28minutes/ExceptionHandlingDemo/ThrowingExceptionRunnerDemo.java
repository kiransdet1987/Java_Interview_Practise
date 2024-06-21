package com.in28minutes.ExceptionHandlingDemo;

class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	class CurrenciesDoNotMatchException extends RuntimeException {
		public CurrenciesDoNotMatchException(String msg) {
			super(msg);
		}
	}
	public void add(Amount that) {
		if (!this.currency.equals(that.currency)) {
			// throw new Exception("Currencies does not match");
			throw new CurrenciesDoNotMatchException(
					"Currencies does not match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
}

public class ThrowingExceptionRunnerDemo {

	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
