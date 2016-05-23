package algoritmTrainingUniRoma1;

import java.util.Scanner;

/*

[TriplePitagoriche]    
Una tripla pitagorica è una tripla di numeri interi a, b, c tali 
che 1 ≤ a ≤ b ≤ c e a2 + b2 = c2. Ciò equivale a dire che a, b, c 
sono le misure dei lati di un triangolo rettangolo (da qui il nome). 
Scrivere un programmma che legge un intero 
M e stampa tutte le triple pitagoriche con c ≤ M.

By Carlo Giordano

*/

public class Exercises4 {

	private static Scanner scanner;

	private static Integer countPythagoreanMath(Integer number) {
		
		Integer count = 0;
		int a, b, c;

		try {
			if (number != null) {
				for (a = 1; a <= number; a++)
					for (b = a + 1; b <= number; b++)
						for (c = b + 1; c <= number; c++) {
							if (pythagorasTernMath(a, b, c))
								count++;
						}
			}
			return count;
		} catch (NullPointerException e) {
			System.out.println("Null number error");
		}

		return count;
	}

	private static Integer countPythagoreanNoMath(Integer number) {
		
		Integer count = 0;
		Integer a, b, c;

		try {
			if (number != null) {
				for (a = 1; a <= number; a++)
					for (b = a + 1; b <= number; b++)
						for (c = b + 1; c <= number; c++) {
							if (pythagorasTernNoMath(a, b, c))
								count++;
						}
			}
			return count;
		} catch (NullPointerException e) {
			System.out.println("Null number error");
		}

		return count;
	}

	private static boolean pythagorasTernMath(Integer a, Integer b, Integer c) {

		double var1;
		double var2;
		var1 = Math.pow(a, 2);
		var2 = Math.pow(b, 2);
		double sum = var1 + var2;
		return sum == Math.pow(c, 2);

	}

	private static boolean pythagorasTernNoMath(Integer a, Integer b, Integer c) {
		return a * a + b * b == c * c;
	}

	public static void main(String args[]) {
		
		scanner = new Scanner(System.in);
		System.out.println("Inserisci numero : ");
		int input = scanner.nextInt();
		
		//First example Math library
		int count = countPythagoreanMath(input);
		System.out.println("Da 1 a " + input + " ci sono " + count + " terne Pitagoriche" );
	
		//Second example no Math library	
		Integer count2 = countPythagoreanNoMath(input);
		System.out.println("Da 1 a " + input + " ci sono " + count2 + " terne Pitagoriche" );
		
		
	}
}
