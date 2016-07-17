/*
 * 
 * Fiscal code calc
 * 
 * File 3:
 * Fiscal Code
 * ReadFileTXT
 * file txt -->codice catastale
 * 
 * by Giordano Carlo
 * 
 */

public class FiscalCode {

	private static int strVoc(char car) {

		char[] voc = { 'A', 'E', 'I', 'O', 'U' };
		int i;
		int res = 0;

		for (i = 0; i < voc.length; i++)
			if (car == voc[i]) {
				res = 1;
				break;
			}
		return res;

	}

	private static String calcSurname(String surn) {

		String cons = null;

		try {
			if (surn != null) {
				String voc;
				int lung;
				int i, sw;

				surn = surn.toUpperCase();
				lung = surn.length();
				voc = "";
				cons = "";
				for (i = 0; i < lung; i++) {
					sw = strVoc(surn.charAt(i));

					if (sw == 1) {
						sw = 0;
						if (voc.length() < 3)
							voc += surn.charAt(i);
					} else {
						if (surn.charAt(i) > 65 & surn.charAt(i) < 91) {
							cons = cons + surn.charAt(i);
							if (cons.length() == 3) {
								voc = "";
								break;
							}
						}
					}
				}

				if (cons.length() < 3) {
					if (cons.length() == 2)
						cons = cons + voc.charAt(0);
					if (cons.length() == 1) {
						if (voc.length() > 1) {
							cons = cons + voc.charAt(0) + voc.charAt(1);
						} else {
							cons = cons + voc.charAt(0) + "X";
						}
					}
					if (cons.length() == 0) {
						if (voc.length() < 3)
							cons = voc + "X";
						else
							cons = voc;
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e);
			cons = "error";
		}
		return cons;

	}

	private static String calcName(String name) {

		String cons = null;

		try {
			if (name != null) {
				String voc;
				String com;
				int lung;
				int i, sw;

				name = name.toUpperCase();
				lung = name.length();
				voc = "";
				cons = "";
				com = "";
				for (i = 0; i < lung; i++) {
					sw = strVoc(name.charAt(i));
					if (sw == 1) {
						sw = 0;
						if (voc.length() < 3)
							voc += name.charAt(i);
					} else {
						if (name.charAt(i) > 65 & name.charAt(i) < 91) {
							cons = cons + name.charAt(i);
							if (cons.length() == 4) {
								voc = "";
								break;
							}
						}
					}
				}
				if (cons.length() < 3) {
					if (cons.length() == 2)
						cons = cons + voc.charAt(0);
					if (cons.length() == 1) {
						if (voc.length() > 1) {
							cons = cons + voc.charAt(0) + voc.charAt(1);
						} else {
							cons = cons + voc.charAt(0) + "X";
						}
					}
					if (cons.length() == 0) {
						if (voc.length() < 3)
							cons = voc + "X";
						else
							cons = voc;
					}
				}
				if (cons.length() > 3) {
					com = cons;
					cons = "";
					cons = cons + com.charAt(0) + com.charAt(2) + com.charAt(3);
				}

			}

		} catch (NullPointerException e) {
			System.out.println(e);
			cons = "error";
		}
		return cons;
	}

	private static String calcolaData(String bornDate, String sex) {

		String dt = "";

		try {
			if (bornDate != null && sex != null) {
				char[] mesi = { 'A', 'B', 'C', 'D', 'E', 'H', 'L', 'M', 'P', 'R', 'S', 'T' };
				int gg, mm, aa;

				aa = (bornDate.charAt(6) - 48) * 10 + (bornDate.charAt(7) - 48);
				if (aa < 10)
					dt += "0";
				dt += aa;
				mm = (bornDate.charAt(2) - 48) * 10 + (bornDate.charAt(3) - 48);
				dt += mesi[mm - 1];
				gg = (bornDate.charAt(0) - 48) * 10 + (bornDate.charAt(1) - 48);
				if (sex == "F")
					gg += 40;
				if (gg < 10)
					dt += "0";
				dt += gg;
			}
		} catch (NullPointerException e) {
			System.out.println(e);
			dt = "error";
		}
		return dt;
	}

	public static String controlCode(String cod) {

		String cc = "";

		try {
			if (cod != null) {

				String numberOdd = "";
				String numberEven = "";
				char[] tabAlfanum = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
						'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
						'Z' };
				int[] tabDispari = { 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20,
						11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23 };
				int[] tabPari = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
						16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

				for (int i = 0; i < cod.length(); i = i + 2) {
					numberOdd += cod.charAt(i);
					if (i < 14)
						numberEven += cod.charAt(i + 1);
				}

				int oddEven = 0;
				for (int i = 0; i < numberOdd.length(); i++) {
					char car = (char) numberOdd.charAt(i);
					for (int j = 0; j < 36; j++) {
						if (car == tabAlfanum[j]) {
							oddEven += tabDispari[j];
							break;
						}
					}
				}
				for (int i = 0; i < numberEven.length(); i++) {
					char car = (char) numberEven.charAt(i);
					for (int j = 0; j < 36; j++) {
						if (car == tabAlfanum[j]) {
							oddEven += tabPari[j];
							break;
						}
					}
				}
				cc += tabAlfanum[(oddEven % 26) + 10];
			}
		} catch (NullPointerException e) {
			System.out.println(e);
			cc = "error";
		}

		return cc;
	}

	public static void main(String[] args) {

		String codeFiscal = "";
		String name = "Rossi";
		String surnamme = "Mario";
		String date = "07111990";
		String sex = "M";
		String bornCity = "MILANO";
		String district = "MI";
		String[] camp = { "", "", "" };
		new ReadFileTXT(camp, bornCity, district);
		String firstCode = calcSurname(surnamme) + calcName(name) + calcolaData(date, sex) + camp[0];
		codeFiscal = firstCode + controlCode(firstCode);
		System.out.println(codeFiscal);


	}

}
