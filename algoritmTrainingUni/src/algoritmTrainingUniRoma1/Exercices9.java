import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * [Duplicati]    Scrivere un programma che legge un intero n e poi 
 * legge una sequenza di n interi e se la sequenza contiene dei valori 
 * ripetuti stampa tutti i valori che si ripetono almeno due volte, 
 * altrimenti stampa "non ci sono duplicati".
 * 
 * 
 * by Carlo Giordano
 */
public class Exercices9 {

	private static Scanner scanner;

	public static void controlWorld(Scanner scan) {

		int[] arrayInt = new int[0];
		
		try {
			if (scan != null) {
				while (scan.hasNext()) {
					int n = scan.nextInt();
					if (Arrays.binarySearch(arrayInt, n) < 0) {
						arrayInt = Arrays.copyOf(arrayInt, arrayInt.length + 1);
						arrayInt[arrayInt.length - 1] = n;
						Arrays.sort(arrayInt);
						System.out.println("No duplicate value");
					} else {
						arrayInt = Arrays.copyOf(arrayInt, arrayInt.length + 1);
						arrayInt[arrayInt.length - 1] = n;
						Arrays.sort(arrayInt);
						System.out.println("Duplicate value : " + n);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Not null please");
		}
	}

	public static void main(String args[]) {

		scanner = new Scanner(System.in);
		System.out.println("Insert second number : ");

		controlWorld(scanner);

	}

}
