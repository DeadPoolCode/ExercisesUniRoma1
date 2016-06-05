
/*
 * 
 * [NumeriPerfetti]    Un numero perfetto è un numero intero che è uguale alla 
 * somma dei suoi divisori propri, ad esempio 6 è perfetto perché 6 = 1 + 2 + 3, 
 * mentre 8 non è perfetto dato che 1 + 2 + 4 non fa 8. Scrivere un programma che 
 * letto un intero M stampa tutti i numeri perfetti minori od uguali a M e le relative somme dei divisori. 
 * Ad esempio se M = 1000 il programma stampa:
 * 
 * 
 * By
 * Carlo Giordano
 * 
 * 
 * 
 */

public class Exercises7 {

	public static Boolean testNumber(Integer number) {

		boolean result = false;
		int div = 1;
		int sumDiv = 0;

		try {
			if (number != null) {
				while (div < number) {
					if (number % div == 0)
						sumDiv = sumDiv + div;
					div = div + 1;
				}
				if (sumDiv == number) {
					System.out.print("Number is " + number + " = " );
					for (int i = 1; i < number; i++) {
						int z = number % i;
						if (z != 0)
							continue;
						System.out.print(i + " ");
					}
				}
				result = sumDiv == number;
			}
		} catch (Exception e) {
			System.out.println("Invalid number !");
		}
		return result;
	}

	public static void main(String[] args) {

		Integer n = 1000;

		for (int i = 1; i <= n; i++) {

			testNumber(i);

		}
	}
}
