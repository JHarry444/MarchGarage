package garage;

import java.util.InputMismatchException;
import java.util.Scanner;

import garage.exceptions.VehicleNotFoundException;

public class Runner {

	private static String bloop;

	public static void main(String[] args) {
		inputValidation();
	}

	private static void inputValidation() {
		Scanner scan = new Scanner(System.in);
		try {
			Integer input = null;
			do {
				try {
					System.out.println("Enter a number:");

					input = Integer.parseInt(scan.nextLine());
					// reads next line as string then convert to number

				} catch (NumberFormatException nfe) {
					System.out.println("That wasn't a number");
				}
			} while (input == null);
			System.out.println("You typed " + input);
		} finally {
			scan.close();
		}
	}

	private static void garageExample() {
		Garage g = new Garage();
		try {
			g.removeVehiclesByType(Car.class);
		} catch (VehicleNotFoundException vnfe) {
			System.out.println("Vehicle type does not exist");
		} catch (NullPointerException npe) {
			System.out.println("Garage does not exist");
		} catch (Exception e) {
			System.out.println("oops");
		}
		System.out.println("end of method");
	}

	private static void boom() {
		boom();
	}

	private static void finallyExample() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a number:");

			int input = scan.nextInt();

			System.out.println("You typed " + input);

		} catch (InputMismatchException ime) {
			System.out.println("That wasn't a number");
		} finally {
			scan.close();
		}
	}

}
