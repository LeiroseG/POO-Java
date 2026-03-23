package entities;

public class Banco {
	private int numero_Conta;
	private String nome_Conta;
	private double saldo;
	public static final int Taxa = 5;

	// construtor sem deposito
	public Banco(int numero_Conta, String nome_Conta) {
		this.numero_Conta = numero_Conta;
		this.nome_Conta = nome_Conta;
	}

	// construtor com deposito
	public Banco(int numero_Conta, String nome_Conta, double valorInicial) {
		this.numero_Conta = numero_Conta;
		this.nome_Conta = nome_Conta;
		this.saldo = valorInicial;
	}

	public int getNumero_Conta() {
		return numero_Conta;
	}

	public String getNome_Conta() {
		return nome_Conta;
	}

	public void setNome_Conta(String nome_Conta) {
		this.nome_Conta = nome_Conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(double remover) {
		this.saldo = this.saldo - remover - Taxa;
	}
	public void depositar(double valor) {
	    this.saldo = this.saldo + valor;
	}
}
