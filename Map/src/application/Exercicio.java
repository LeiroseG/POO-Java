package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		Map<String, TreeMap<String, Integer>> votosMap = new TreeMap<>();

		Map<String, Integer> votos = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int countVotes = Integer.parseInt(fields[1]);

				int totalVotos = votos.getOrDefault(name, 0) + countVotes;
				votos.put(name, totalVotos);

				line = br.readLine();
			}

			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key) + " votos");
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}