import java.util.Scanner;

/*
 * 
 * [DigitandoInteri]  Scrivere un programma che legge due interi e ne stampa il prodotto. Prevedere che l'utente possa 
 * sbagliare a digitare gli interi e con un'opportuna gestione delle eccezioni far sì che il programma permetta all'utente 
 * di ridigitare l'intero finché entrambi gli interi non sono digitati in modo corretto.
 * 
 * 
 * 
 * 
 * by Carlo Giordano
 * 
 */


public class Exercises13 {

	private static Scanner scanner;

	public static int scanNumber(Scanner scanner) {

		Integer input = null;
		try {
			if (scanner != null) {
				System.out.println("Insert number : ");
				while (!scanner.hasNextInt()) {
					scanner.next();
					System.out.println("Error not number");
					System.out.println("Insert number : ");
				}
				input = scanner.nextInt();
			}
		} catch (NullPointerException e) {
			System.out.println("Object Scanner is null");
		}
		return input;
	}

	public static int moltiplication(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		int inputA = scanNumber(scanner);
		int inputB = scanNumber(scanner);

		int moltiplication = moltiplication(inputA, inputB);
		System.out.println("Result Moltiplication : " + moltiplication);
	}
}
