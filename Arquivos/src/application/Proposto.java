package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Proposto {
	public static void main(String[] args) {

		String path = "E:\\Projetos Eclipse\\Exercicio.csv";

		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] partes = line.split(",");

				String name = partes[0];
				Double price = Double.parseDouble(partes[1]);
				Integer quantity = Integer.parseInt(partes[2]);

				System.out.println("Produto: " + name);
				System.out.println("Preço: " + price);
				System.out.println("Quantidade: " + quantity);

				list.add(new Product(name, price, quantity));

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error:  " + e.getMessage());
		}

		String writer = "E:\\Projetos Eclipse\\out.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(writer))) {
			for (Product pzinho : list) {
				String linha = pzinho.getName() + "," + pzinho.valorFinal();
				bw.write(linha);
				bw.newLine();
			
			}
			System.out.println("Arquivo criado com sucesso");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
