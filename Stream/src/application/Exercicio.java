package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Dados;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Dados> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Dados(fields[0], Double.parseDouble(fields[2]), fields[1]));
				line = br.readLine();

			}

			System.out.println("Enter one salary to check :");
			Double salary = sc.nextDouble();

			List<String> names = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted()
					.collect(Collectors.toList());
			names.forEach(System.out::println);

			double sum = list.stream()
				    .filter(p -> p.getName().toUpperCase().startsWith("M"))
				    .mapToDouble(Dados::getSalary)
				    .sum();

			/*
			 * double avg = list.stream() .filter(p ->
			 * p.getName().toUpperCase().startsWith("M")) .map(p -> p.getSalary())
			 * .reduce(0.0, (x, y) -> x + y) / list.size()
			 */

			;

			System.out.println("Average price: " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
