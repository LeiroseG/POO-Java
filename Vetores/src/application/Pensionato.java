package application;

import java.util.Scanner;

import entities.Aluguel;

public class Pensionato {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented: ");
		Aluguel[] vect = new Aluguel[10];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(name, email);
		}
		for (int i = 0; i < 9; i++) {
			if (vect[i] != null) {
				System.out.print(
						"Quarto alugado : " + i + " ,Name: " + vect[i].getName() + ", Email: " + vect[i].getEmail());
			}
		}

		sc.close();
	}
}