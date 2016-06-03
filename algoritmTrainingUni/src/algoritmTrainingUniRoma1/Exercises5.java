import java.util.Scanner;

/*
[PI] Scrivere un programma che letto un intero 
k stampa la somma dei primi k termini della serie

Leibniz Formula For PI

Carlo Giordano
*/

public class Exercises5 {

	private static Scanner scanner;

	public static Integer piCount(Integer k) {

		Integer count = 0;
		double pi = 0;
		double denominator = 1;

		try {
			if (k != null) {

				for (int x = 0; x < k; x++) {
					if (x % 2 == 0) {
						pi = pi + (1 / denominator);
					} else {
						pi = pi - (1 / denominator);
					}
					denominator = denominator + 2;
					count++;
				}

			}

		} catch (NullPointerException e) {
			System.out.println("ErrorNull");
			return null;
		}
		pi = pi * 4;
		System.out.println(pi);
		return count;
	}

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Inserisci numero : ");
		Integer input = scanner.nextInt();
		Integer countPi = piCount(input);

		System.out.println("Test " + countPi);

	}

}