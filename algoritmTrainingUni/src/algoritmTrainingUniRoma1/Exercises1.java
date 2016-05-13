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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


	/**
	 * Qualche piccola nota.
	 * 1)Nessuno ti ha chiesto di riempire la stringa con spazi vuoti, hai modificato un dato,
	 * questa cosa DEVI EVITARLA.
	 * 2)Le stringhe le passiamo come parametro, altrimenti il metodo non è testabile.
	 * 3)Studiati un minimo la classe Math, ci sono metodi interessanti come puoi vedere ;-)
	 * 4)Perchè il test fallisce se passo delle stringhe null? Come possiamo evitare questa situazione?
	 * P.s. la risposta NON È: "catturando l'eccezione" :-)
	 *
	 * @param str1
	 * @param str2
	 * @param str3
     */
	public static void exerciseCorrections(String str1, String str2, String str3){
		int maxLenght = Math.max(str1.length(), Math.max(str2.length(), str3.length()));
		for(int i = 0 ; i < maxLenght ; i++){
			if(i < str1.length()) System.out.print(str1.charAt(i));
			else System.out.print(" ");
			if(i < str2.length()) System.out.print(str2.charAt(i));
			else System.out.print(" ");
			if(i < str3.length()) System.out.println(str3.charAt(i));
			else System.out.println(" ");
		}
	}

	public static void main(String args[]) {

		System.out.println("I test - dati dell'esercizio");

		String str1 = "gioco";
		String str2 = "OCA";
		String str3 = "casa";

		exerciseCorrections(str1, str2, str3);

		System.out.println("II test - stringhe vuote");

		str1 = "";
		str2 = "";
		str3 = "";

		exerciseCorrections(str1, str2, str3);

		System.out.println("III test - stringhe null");

		str1 = null;
		str2 = null;
		str3 = null;

		exerciseCorrections(str1, str2, str3);

	}
}