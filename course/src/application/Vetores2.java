package application;

import java.util.Scanner;

import entities.Vetor;

public class Vetores2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		Vetor[]vect = new Vetor[n];
		
		for (int i=0 ;i<vect.length ; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vetor(name, price);
		}
	
		double sum = 0;
		for (int i=0; i<vect.length ;i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		
		
		 System.out.println("AVARAGE PRICE : " + avg);
		sc.close();
	}
	
}
