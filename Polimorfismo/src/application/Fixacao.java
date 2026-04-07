package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Fixacao {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product # " + i + "data : ");
			System.out.println("Common,used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			String name;
			double price;
			if (ch == 'c') {
				sc.nextLine();
				System.out.println("Name: ");
				name = sc.nextLine();
				System.out.println("Price ");
				price = sc.nextDouble();

				list.add(new Product(name, price));
			}
			if (ch == 'u') {
				sc.nextLine();
				System.out.println("Name: ");
				name = sc.nextLine();
				System.out.println("Price ");
				price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name,price,manufactureDate));
			}
			if (ch == 'i') {
				sc.nextLine();
				System.out.println("Name: ");
				name = sc.nextLine();
				System.out.println("Price ");
				price = sc.nextDouble();
				System.out.println("Customs fee:  ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
			}

			for (Product p : list) {
				System.out.println(p.priceTag());
			}

		}

		sc.close();
	}
}
