package entities;

public class Pessoas {
	private String name;
	private int years_Old;
	private double height;

	public Pessoas(String name, int years_Old, double height) {
		super();
		this.name = name;
		this.years_Old = years_Old;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears_Old() {
		return years_Old;
	}

	public void setYears_Old(int years_Old) {
		this.years_Old = years_Old;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
