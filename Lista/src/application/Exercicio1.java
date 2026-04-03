package application;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// lista nao aceita tipos primitivos tipo int
		List<Funcionario> list = new LinkedList<>();

		int n = sc.nextInt();

		// Funcionario[]vect = new Funcionario[n];

		for (int i = 0; i < n; i++) {
			int x = i + 1;
			System.out.println("Employee : #" + x);
			System.out.print("id :");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name :");
			String name = sc.nextLine();
			System.out.print("Salary :");
			double salary = sc.nextDouble();

			list.add(new Funcionario(id, name, salary));
		}

		System.out.println("Enter the employee id that will have salary inc : ");
		int newid = sc.nextInt();

		boolean encontrado = false;
		for (Funcionario x : list) {

			if (x.getId() == newid) {
				System.out.println("QUanto de aumento voce vai dar : ");
				double porcentagem = sc.nextDouble();
				x.aumentarSalario(porcentagem);
				encontrado = true;

			}
		}
		if (!encontrado) {
			System.out.println("This id does'nt exists.");
		}

		System.out.println("List of employees : ");

		System.out.println(list.toString());

		sc.close();
	}

}
