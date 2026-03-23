package application;

import java.util.Scanner;
import entities.Rectangle;

public class Exercicio1 {
		
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Insira o valor da largura");
		rectangle.largura = sc.nextDouble();
		System.out.print("Insira o valor da altura");
		rectangle.altura = sc.nextDouble();
		
		System.out.printf("AREA : %.2f %n ", rectangle.area());
		System.out.printf("PERIMETER : %.2f %n ",rectangle.perimeter());
		System.out.printf("DIAGONAL : %.2f %n ",rectangle.diagonal());
		sc.close();
	}
}
