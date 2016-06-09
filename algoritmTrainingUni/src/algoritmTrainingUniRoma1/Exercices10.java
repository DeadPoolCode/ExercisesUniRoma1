import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * [OrdinaCaratteri]    Scrivere un programma che legge 
 * una stringa e stampa la sequenza ordinata dei caratteri 
 * della stringa. Ad esempio, se la stringa è "io programmo in Java" 
 * allora il programma stampa
 * 
 * 
 * 
 * by Carlo Giordano
 */

public class Exercices10 {

	private static Scanner scanner;

	public static String orderArray(String s) {

		String s1 = "";
		
		try {
			if (s != null) {
				char[] tempA = s.toCharArray();
				Arrays.sort(tempA);
				s1 = new String(tempA);
			}
		} catch (NullPointerException e) {
			System.out.println("String null!!!!!!!!!!!");
		}

		return s1;
		
	}

	public static void main(String args[]) {

		scanner = new Scanner(System.in);

		System.out.println("Insert character : ");
		String charString = scanner.nextLine();
		String printOrderArray = orderArray(charString);

		System.out.println(printOrderArray.trim());

	}

}
