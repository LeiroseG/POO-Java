package entities;

public class Funcionario {
	public String name;
	public double salario;
	public double tax;
	
	public double salarioLiq() {
		return salario - tax;
	}
	public void aumento(double porcaumento) {
		 salario += salario * porcaumento /100 ;
	}
}
