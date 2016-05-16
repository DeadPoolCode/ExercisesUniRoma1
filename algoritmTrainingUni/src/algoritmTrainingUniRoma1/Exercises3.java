package algoritmTrainingUniRoma1;

/*

  Scrivere un programma che legge una serie di numeri interi 
	
	positivi (la lettura si interrompe quando 
  	è letto un numero negativo) e stampa i tre numeri più grandi della serie. Ad esempio, se la serie di numeri 
  	è 2,10,8,7,1,12,2 allora il programma stampa:
	I tre numeri più grandi sono: 12, 10, 8

By Carlo Giordano
*/

import java.util.ArrayList;
import java.util.List;

public class Exercises3 {

	public static void main(String[] args) {

		List<Double> number = new ArrayList<Double>();

		// FirstTest --> no negative number

		number.add(2.0);
		number.add(10.0);
		number.add(8.0);
		number.add(7.0);
		number.add(1.0);
		number.add(12.0);
		number.add(2.0);
		List<Double> numberTest = readNumber(number);
		threeMaxNumber(numberTest);

		// SecondTest --> negative number;
		List<Double> number2 = new ArrayList<Double>();

		number2.add(2.0);
		number2.add(10.0);
		number2.add(-8.0);
		number2.add(4.0);
		readNumber(number2);

		// null Testing
		List<Double> number3 = new ArrayList<Double>();
		number3.add(3.0);
		number3.add(null);
		number3.add(10.0);
		readNumber(number3);
	}

	private static List<Double> readNumber(List<Double> x) {

		List<Double> newList = new ArrayList<Double>();

		for (Double number : x) {
			try {
				newList.add(number);
				// stopping negative number
				if (Math.signum(number) == -1.0) {
					System.out.println("Negative number");
					break;
				}
			} catch (NullPointerException e) {
				// null handler
				System.out.print("Null number" + e);
				return null;
			}
		}
		return newList;

	}

	private static void threeMaxNumber(List<Double> numberTest) {

		Double maxOne = 0.0;
		Double maxTwo = 0.0;
		Double maxThree = 0.0;

		for (Double number : numberTest) {
			if (number == null)
				break;
			// Search 3max number
			if (maxOne < number) {
				maxTwo = maxOne;
				maxOne = number;
			} else if (maxTwo < number) {
				maxThree = maxTwo;
				maxTwo = number;
			} else if (maxThree < number) {
				maxThree = number;
			}
		}
		System.out.println("I tre numeri più grandi sono : " + maxOne.intValue() + ", " + maxTwo.intValue() + ", "
				+ maxThree.intValue());
	}
}
