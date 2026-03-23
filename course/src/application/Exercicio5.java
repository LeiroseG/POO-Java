package application;

import java.util.Scanner;
import entities.Banco;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco conta;

		System.out.print("Digite o numero da conta");
		int numero = sc.nextInt();
		System.out.println();
		sc.nextLine();
		System.out.print("Digite o nome da conta");
		String nome = sc.nextLine();
		System.out.print("Haverá depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's' || resposta == 'S') {
			System.out.print("Digite o valor do depósito inicial: ");
			double valorInicial = sc.nextDouble();

			conta = new Banco(numero, nome, valorInicial);
		} else {
			conta = new Banco(numero, nome);
		}
		System.out.println();
		System.out.println("Dados da conta:");

		System.out.println("Conta " + conta.getNumero_Conta() + ", Titular: " + conta.getNome_Conta() + ", Saldo: R$ "
				+ conta.getSaldo());

		System.out.println();
		System.out.print("Entre com um valor para depósito: ");
		double valorDeposito = sc.nextDouble();

		conta.depositar(valorDeposito);
		System.out.println("Dados da conta atualizados:");
		System.out.println("Dados da conta");
		System.out.println("Conta " + conta.getNumero_Conta() + ", Titular : " + conta.getNome_Conta() + ", Saldo : "
				+ conta.getSaldo());

		System.out.println();
		System.out.print("Entre com um valor para saque (lembre-se da taxa de 5 reais!): ");
		double valorSaque = sc.nextDouble();

		conta.saque(valorSaque);
		// poderia fazer um toString de System.out.println("Conta " +
		// conta.getNumero_Conta() + ", Titular : " + conta.getNome_Conta() + ", Saldo :
		// " + conta.getSaldo());
		System.out.println("Dados da conta atualizados:");
		System.out.println("Dados da conta");
		System.out.println("Conta " + conta.getNumero_Conta() + ", Titular : " + conta.getNome_Conta() + ", Saldo : "
				+ conta.getSaldo());
		sc.close();
	}

}
