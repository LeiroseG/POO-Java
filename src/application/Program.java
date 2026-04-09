package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number : ");
		int number = sc.nextInt();

		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

		if (!checkOut.isAfter(checkIn)) {
			System.out.print("Error in Reservation : Check-out date must be after the date of check in ");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation : " + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), fmt);

			LocalDate now = LocalDate.now();
			if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
				System.out.print("Error in Update date must be after the date check-in ");
			} else if (!checkOut.isAfter(checkIn)) {
				System.out.print("Error in Reservation : Check-out date must be after the date of check in ");
			} else {
				reservation = new Reservation(number, checkIn, checkOut);
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation : " + reservation);
			}

		}

		sc.close();
	}

}
