package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progam {
	public static void main(String[] args) {
		// lista nao aceita tipos primitivos tipo int
		List<String> list = new ArrayList<String>();

		list.add("Maria" + ","+ " 333");
		list.add("Bob"+ "444");
		list.add("Seria");
		list.add("Jorge");
		list.add("Maria");
		list.add(2, "Jorgim");

		System.out.println("Tamanho lista : " + list.size());
		// remove pelo objeto
		list.remove("Maria");

		// remove pelo prediccado
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("----------------------------------------------");
		// posicao de um elemento , se nao encontrar elemento ele da -1
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// filtrar uma lista com X elementos, estamo convertendo ele para -> stream ai filtramos e retornamos ele para list(collect(Collectors.tolist());
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		// pegar o primeiro predicado da string que tem 'M' se nao retornar nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'X').findFirst().orElse(null);
		System.out.println(name);
	}
}
