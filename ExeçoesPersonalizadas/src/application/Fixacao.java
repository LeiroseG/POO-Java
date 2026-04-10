package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Fixacao {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data ");
			System.out.println("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.println("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.println("Withdraw Limit: ");
			Double withdrawlimit = sc.nextDouble();
			
			Account acc = new Account(number,holder,balance,withdrawlimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
			
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Input error: Invalid format");
		}
		
		
		
		sc.close();
	}
}
