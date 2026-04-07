package entities;

public class Juridica extends Contribuinte {
	private int funcionarios;

	public Juridica() {
		super();
	}
	


	public Juridica(String name, double renda_anual, int funcionarios) {
		super(name, renda_anual);
		this.funcionarios = funcionarios;
	}



	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		if(funcionarios <= 10) {
			return super.getRenda_anual()*0.16;
		}else {
			return super.getRenda_anual()*0.14;
		}
	}

}
