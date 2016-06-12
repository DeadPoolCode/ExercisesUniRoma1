import java.util.Scanner;

/*
 * [QuadratiMagici]    Un quadrato magico è una disposizione di numeri interi 
 * distinti in una tabella quadrata tale che la somma dei numeri presenti in ogni riga, 
 * in ogni colonna e in entrambe le diagonali dia sempre lo stesso numero. 
 * Ad esempio, il seguente è un quadrato magico di ordine 3:
 * 
 * 
 * By Carlo Giordano
 * 
 */

public class Exercices11 {

	private static Scanner scanner;

	public static int[][] magicSquare(int n) {

		if (n % 2 == 0)
			throw new RuntimeException("N must be odd");

		int[][] magic = new int[n][n];

		int row = n - 1;
		int col = n / 2;
		magic[row][col] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (magic[(row + 1) % n][(col + 1) % n] == 0) {
				row = (row + 1) % n;
				col = (col + 1) % n;
			} else {
				row = (row - 1 + n) % n;
			}
			magic[row][col] = i;
		}

		return magic;
	}

	public static void printSquareMagic(int magic[][], int n) {

		// print results
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (magic[i][j] < 10)
					System.out.print(" "); // for alignment
				if (magic[i][j] < 100)
					System.out.print(" "); // for alignment
				System.out.print(magic[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.print("Insert number : ");
		int n = scanner.nextInt();

		int[][] magic = magicSquare(n);
		printSquareMagic(magic, n);

	}
}
