package entities;

public abstract class Contribuinte {
	private String name;
	private double renda_anual;
	
	public Contribuinte() {
		super();
	}

	public Contribuinte(String name, double renda_anual) {
		super();
		this.name = name;
		this.renda_anual = renda_anual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRenda_anual() {
		return renda_anual;
	}

	public abstract double imposto();
	
}
