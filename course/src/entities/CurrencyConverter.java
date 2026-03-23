package entities;

	
	public class CurrencyConverter{
	
	
	public static final double IOF = 1.06;


	public static double converter(double cotacao, double dolares) {
		return dolares * cotacao * IOF;
		}



	}

