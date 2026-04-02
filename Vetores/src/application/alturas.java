package application;

import java.util.Scanner;

import entities.Pessoas;

public class alturas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double soma = 0.0;
		int contador = 0;

		int n = sc.nextInt();
		Pessoas[] vect = new Pessoas[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int years = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new Pessoas(name, years, height);

		}

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getHeight();

			if (vect[i].getYears_Old() < 16) {
				contador += 1;

			}

		}

		double media = soma / n;
		System.out.printf("Altura média: %.2f%n", media);

		double porcentagem = ((double) contador / n) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getYears_Old() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}
}
