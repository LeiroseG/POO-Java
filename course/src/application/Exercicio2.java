package application;

import java.util.Scanner;

import entities.Funcionario;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite seu nome:");
		funcionario.name= sc.nextLine();
		System.out.println("Seu salario");
		funcionario.salario= sc.nextDouble();
		System.out.println("Imposto");
		funcionario.tax= sc.nextDouble();
		
		System.out.print(funcionario.name + ", $ " + funcionario.salarioLiq());
		
		System.out.println();
		System.out.print("quantos porcento de aumento voce teve: ");
		double porcaumento = sc.nextDouble();
		funcionario.aumento(porcaumento);
		System.out.print(funcionario.name + ", $ " + funcionario.salarioLiq());
		
		sc.close();
	}
}
