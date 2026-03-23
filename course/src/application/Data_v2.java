package application;

import java.util.Scanner;

import entities.Product_v2;

public class Data_v2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira seu produto");
		System.out.print("name");
		String name = sc.nextLine();
		System.out.print("price");
		double price = sc.nextDouble();
		
		
	
		
		//int quantity = sc.nextInt();
		
		Product_v2 product = new Product_v2(name, price );
		
		
		product.setName("Computer");
		System.out.println("Updated name : " + product.getPrice());
		System.out.println(product);
		
		sc.close();
	}
}