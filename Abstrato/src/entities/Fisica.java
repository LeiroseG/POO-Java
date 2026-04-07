package entities;

public class Fisica extends Contribuinte {
	
	private double gastos_saude;
	
	public  Fisica() {
		super();
	}
	
	public double getGastos_saude() {
		return gastos_saude;
	}

	public void setGastos_saude(double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}

	public Fisica(String name, double renda_anual, double gastos_saude) {
		super(name, renda_anual);
		this.gastos_saude = gastos_saude;
	}

	@Override
	public double imposto() {
		
		if(super.getRenda_anual() < 20000) {
			return super.getRenda_anual() * 0.15 - gastos_saude * 0.5;
		}else {
			return super.getRenda_anual() * 0.25 - gastos_saude * 0.5;
		}
		
	}
	

}
