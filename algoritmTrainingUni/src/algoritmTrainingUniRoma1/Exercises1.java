package algoritmTrainingUniRoma1;

/*
Scrivere un programma che legge tre stringhe e le stampa
in verticale l'una accanto all'altra. Ad esempio, se le
stringhe sono "gioco", "OCA" e "casa" allora il programma stampa:
gOc
iCa
oAs
c a	
o

By Carlo Giordano
*/

public class Exercises1 {

	private static void exercises() {
		String str1 = "gioco", str2 = "OCA", str3 = "casa";
		for (int i = 0; i < str1.length(); i++) {
			if (i <= (str1.length() - str2.length())) {
				str2 += " ";
				str3 += " ";
			}
			System.out.println(str1.charAt(i) + " " + str2.charAt(i) + " " + str3.charAt(i));
		}
	}

	public static void main(String args[]) {

		exercises();

	}
}