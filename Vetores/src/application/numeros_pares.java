package application;

import java.util.Scanner;

import entities.Pares;

public class numeros_pares {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Pares[] vect = new Pares[n];
		int contador = 0;

		for (int i = 0; i < vect.length; i++) {

			int numero = sc.nextInt();

			vect[i] = new Pares(numero);

			if (vect[i].getNumeros() % 2 == 0) {
				contador += 1;
			}
		}

		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getNumeros() % 2 == 0) {
				System.out.println("Numeros pares : " + vect[i].getNumeros());
			}

		}

		System.out.println("Quantide de pares: " + contador);

		sc.close();
	}
}
