package application;

import java.util.Scanner;

import entities.Product;

public class Data {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("insira seu produto");
		System.out.print("name");
		product.name = sc.nextLine();
		System.out.print("price");
		product.price = sc.nextDouble();
		System.out.print("Quantity");
		product.quantity = sc.nextInt();
		
		
		System.out.println(product);
		
		sc.close();
	}
}
