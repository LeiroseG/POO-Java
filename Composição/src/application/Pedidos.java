package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Pedidos {
	public static void main(String [] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data :");
		System.out.println("Name :");
		String name = sc.next();
		System.out.println("Email :");
		String email = sc.next();
		System.out.println("Birth date :");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client (name, email, birthDate);
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(), status, client);
		
		for (int i = 1; i<=n ;i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.println("Product name:");
			String productname = sc.next();
			System.out.println("Product price : ");
			double productprice = sc.nextDouble();
			System.out.print("Quantity :");
			int productquantity = sc.nextInt();
			
			Product product = new Product (productname, productprice);
			
			OrderItem orderitem = new OrderItem(productquantity,productprice, product);
			
			order.addItem(orderitem);
			
		}
		
		System.out.println(); // Pula uma linha para ficar organizado
        System.out.println(order);
		
		sc.close();
	}
}
