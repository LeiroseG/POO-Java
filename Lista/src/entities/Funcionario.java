package entities;

public class Funcionario {
	private int id;
	private String name;
	private double salary;
	public Funcionario(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void aumentarSalario(double porcentagem) {
	    salary += salary * porcentagem / 100.0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public String toString() {
		return this.id + ", " + this.name  + ", " + String.format("%.2f",this.salary);
	}
}
