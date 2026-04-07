package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getcustomsFee() {
		return customsFee;
	}

	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	
	@Override
	public String priceTag() {
		return "Price Tags: \n" + getName() + " $ " + totalPrice() + "(Customs fee: $ " + getcustomsFee() + ")";	
	}
}
