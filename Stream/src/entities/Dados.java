package entities;

public class Dados {
	private String name;
	private Double salary;
	private String email;

	public Dados(String name, Double salary, String email) {
		this.name = name;
		this.email = email;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
