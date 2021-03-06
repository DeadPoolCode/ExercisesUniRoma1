package algoritmTrainingUniRoma1;
/*
 * 
 * 
[Vocali]Scrivere un programma che legge una 
linea di testo e per ogni vocale stampa il 
numero di volte che appare nella linea di testo. 
Ad esempio, se la linea di testo è "mi illumino di immenso" 
allora il programma stampa:
a: 0    e: 1    i: 5    o: 2    u: 1

By Carlo Giordano
*/

public class Exercises2 {

	/**
	 * Qualche piccola nota.
	 * 1)Le stringhe le passiamo come parametro, altrimenti il metodo non è testabile.
	 * 2)Non mi piacciono le funzioni che ritornano void, prova a ritornare i valori e stampali nel main.
	 * 2)Perchè il test fallisce se passo delle stringhe null? Come possiamo evitare questa situazione
	 * evitando di aggiungere anche un solo carattere al codice? Ragionaci! :-)
	 * @param text
     */
	private static void exercises(String text) {

		if(text.length() == 0 || text == null) return;

		// count number vocal
		int count_a = 0;
		int count_e = 0;
		int count_i = 0;
		int count_o = 0;
		int count_u = 0;

		// vocal
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';


		for (int y = 0; y < text.length(); y++) {

			if (text.charAt(y) == a)
				count_a++;
			if (text.charAt(y) == e)
				count_e++;
			if (text.charAt(y) == i)
				count_i++;
			if (text.charAt(y) == o)
				count_o++;
			if (text.charAt(y) == u)
				count_u++;

		}
		System.out.println("a:" + count_a + " " + "e:" + count_e + " " + "i:" + count_i + " " + "o:" + count_o + " "
				+ "u:" + count_u);

	}

	public static void main(String args[]) {


		System.out.println("I test - dati esercizio");
		String text = "mi illumino di immenso";
		exercises(text);

		System.out.println("II test - dati esercizio");
		 text = "";
		exercises(text);

		System.out.println("I test - dati esercizio");
		text = null;
		exercises(text);
	}

}
