package application;

import java.util.Scanner;

import entities.Notas;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		System.out.println("QUal seu nome e suas notas");
		notas.name = sc.nextLine();
		notas.nota1= sc.nextDouble();
		notas.nota2= sc.nextDouble();
		notas.nota3= sc.nextDouble();
		
		
		System.out.printf("Final grade : ", notas.notaFinal());
		
		sc.close();
	}
}
