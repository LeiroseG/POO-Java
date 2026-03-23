package entities;

public class Product_v2 {

	private String name;
	private double price;
	private int quantity;

	public Product_v2(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public Product_v2(String name, double price) {
		this.name = name;
		this.price = price;
		// this.quantity = 0; opcional pois em java int é iniciado em 0
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

	public void addProducts(int quantity) {
		// this é uma auto referencia para um atributo da classe vulgo se eu chamar
		// this.quantity eu estou referenciando o product
		// se eu n fizer isso da conflito de quantity
		this.quantity += quantity; // como eu coloquei o this ele pegou o quantity do product e adicionou a
									// referencia do novo argumento

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// sobrenpondo o objeto projeto para um toString
	public String toString() {

		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + "units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
}