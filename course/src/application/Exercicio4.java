package application;

import java.util.Scanner;

import entities.CurrencyConverter;


public class Exercicio4 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("What is the dollar price");
	double cotacao = sc.nextDouble();
	System.out.println("How many dollars will be bought?");
	double dolares = sc.nextDouble();
	
	
	System.out.printf("Ammout to be paid in reais = %.2f", CurrencyConverter.converter(cotacao, dolares));
		
	
	
	
	
	
	
	sc.close();
	}
}
