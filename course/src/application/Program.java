package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter your triangle measusres of X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter your triangle measusres of Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area :  %.4f %n", areaX);
		System.out.printf("Triangle Y area :  %.4f %n", areaY);

		if (areaX > areaY) {
			System.out.println("Triangle X is the higher");
		} else {

			System.out.println("Triangle Y is the higher");
		}
		sc.close();
	}

}
