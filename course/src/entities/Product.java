package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	

	public double totalValueInStock() {
		return price * quantity;
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