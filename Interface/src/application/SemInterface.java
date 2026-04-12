package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class SemInterface {
	public static void main(String[]args ) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		
		System.out.println("Entre com os dados do aluguel ");
		System.out.print("Modelo do Carro ");
		String carModel = sc.nextLine();
		System.out.print("Retirada : ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno : ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr= new CarRental(start,finish,new Vehicle(carModel));
		
		System.out.print("Entre o preço por hora : " );
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre o preço por dia : " );
		double pricePerDay = sc.nextDouble();
		
		
		RentalService rentalService = new RentalService(pricePerDay,pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura : ");
		System.out.println("Pagamento basico :  : " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto : "+ cr.getInvoice().getTax());
		System.out.println("Pagamento total  : " + cr.getInvoice().getTotalPayment());
		
		
		
		
		
		sc.close();
		
	}
}
