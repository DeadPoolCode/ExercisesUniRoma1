import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

[CifreLettere]    Scrivere un programma che legge un intero n e stampa le cifre di n 
in lettere. Ad esempio, se n = 2127, il programma stampa: due uno due sette.

By Carlo Giordano
*/

public class Exercises6 {

	private static Scanner scanner;

	public static String translateNumber(Integer a) {

		String letter = "";

		try {
			if (a != null) {

				switch (a) {
				case 1:
					letter = "Uno";
					break;
				case 2:
					letter = "Due";
					break;
				case 3:
					letter = "Tre";
					break;
				case 4:
					letter = "Quattro";
					break;
				case 5:
					letter = "Cinque";
					break;
				case 6:
					letter = "Sei";
					break;
				case 7:
					letter = "Sette";
					break;
				case 8:
					letter = "Otto";
					break;
				case 9:
					letter = "Nove";
					break;

				default:
					letter = "non esiste";
					break;
				}

			}
		} catch (Exception e) {
			System.out.println("Passi un null...sei fuori");
		}

		return letter;
	}

	public static List<String> translateNumberList(List<Integer> a) {

		List<String> letters = new ArrayList<String>();

		for (Integer integer : a) {
			String letter = "";
			try {
				if (integer != null) {

					switch (integer) {
					case 1:
						letter = "Uno";
						break;
					case 2:
						letter = "Due";
						break;
					case 3:
						letter = "Tre";
						break;
					case 4:
						letter = "Quattro";
						break;
					case 5:
						letter = "Cinque";
						break;
					case 6:
						letter = "Sei";
						break;
					case 7:
						letter = "Sette";
						break;
					case 8:
						letter = "Otto";
						break;
					case 9:
						letter = "Nove";
						break;
					default:
						letter = "non esiste";
						break;
					}
					letters.add(letter);
				}
			} catch (Exception e) {
				System.out.println("Passi un null...sei fuori");
			}
		}
		return letters;
	}

	public static void main(String[] args) {

		// First Example
		scanner = new Scanner(System.in);
		System.out.println("Insert second number : ");
		int input = scanner.nextInt();

		String a = translateNumber(input);

		System.out.println("Insert second number : ");
		int input2 = scanner.nextInt();
		String b = translateNumber(input2);

		System.out.println("Insert third number : ");
		int input3 = scanner.nextInt();
		String d = translateNumber(input3);

		System.out.println("Insert fourth number : ");
		int input4 = scanner.nextInt();
		String e = translateNumber(input4);

		System.out.println(a + " " + b);

		// Second Example
		List<Integer> addNumber = new ArrayList<Integer>();
		addNumber.add(input);
		addNumber.add(input2);
		addNumber.add(input3);
		addNumber.add(input4);

		List<String> printLetters = translateNumberList(addNumber);

		for (String string : printLetters) {
			System.out.print(string + " ");

		}

	}

}
