package entities;

public class CurrencyConverter {
	
	public static double iof = 0.06;
	
	public static double dolarToReal(double amount, double dolarPrice ) {
		return amount * dolarPrice * (1.0 + iof);
	}
	
}
