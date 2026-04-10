package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		String[]vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		}
		catch(InputMismatchException e) {
			System.out.println("Input erro");
		}
	
	
		System.out.println("END");
		
		sc.close();
	}
}