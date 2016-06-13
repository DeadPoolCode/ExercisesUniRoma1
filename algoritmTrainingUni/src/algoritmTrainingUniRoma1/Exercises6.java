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

	public static List<Integer> readSting(String s) {

		List<Integer> number = new ArrayList<Integer>();

		try {
			if (s != null) {
				char[] tempA = s.toCharArray();
				for (int i = 0; i < tempA.length; i++) {
					Integer n = Character.getNumericValue(tempA[i]);
					number.add(n);
				}
			}
		} catch (NullPointerException e) {
			System.out.println("String null!!!!!!!!!!!");
		}

		return number;
	}

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

		scanner = new Scanner(System.in);
		System.out.println("Insert second number : ");
		String input = scanner.nextLine();

		List<Integer> numberList = readSting(input);

		List<String> printLetters = translateNumberList(numberList);

		for (String string : printLetters) {
			System.out.print(string + " ");

		}

	}

}
