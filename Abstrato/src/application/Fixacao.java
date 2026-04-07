package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

public class Fixacao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.println("ENTER THE NUMBER OF TAX PAYERS : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			String name;
			double income;
			System.out.println("Tax payer #" + i + " data:");
			System.out.println("Individual or company(i/c)?");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				sc.nextLine();
				System.out.println("Name: ");
				name = sc.nextLine();
				System.out.println("Anual income:  ");
				income = sc.nextDouble();
				System.out.println("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Fisica(name, income, health));
			} else {
				sc.nextLine();
				System.out.println("Name: ");
				name = sc.nextLine();
				System.out.println("Anual income:  ");
				income = sc.nextDouble();
				System.out.println("Number of employees : ");
				int employee = sc.nextInt();
				list.add(new Juridica(name, income, employee));
			}
		}
		System.out.println("Taxes PAID : ");
		
		double sum=0.0;
		for(Contribuinte c : list) {
			System.out.println(c.getName()+ ":  $ " + String.format("%.2f", c.imposto() ));
			sum += c.imposto();
		}

		System.out.println("Total Taxes PAID : " + sum);
		sc.close();
	}
}
