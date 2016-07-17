
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

import java.io.*;

public class ReadFileTXT {

	private File inputFile;
	private FileInputStream fis;
	private String[] camp = { "", "", "" };
	String file = "/home/deadpool/codici_catastali.txt";

	public ReadFileTXT(String[] camp, String bornCity, String district) {

		try {
			if (camp != null && bornCity != null && district != null) {

				for (int i = 0; i < this.camp.length; i++)
					this.camp[i] = camp[i];
				try {
					this.inputFile = new File(file);
					this.fis = new FileInputStream(inputFile);
					int rit = LeggiRecord(bornCity, district);
					if (rit == 1) {
						camp[0] = this.camp[0];
					}
				} catch (IOException e) {
					System.out.println(e);
				} finally {
					try {
						fis.close();
					} catch (IOException e) {
						System.out.println(e);
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

	private int LeggiRecord(String bornCity, String district) {

		int c = 0;

		try {
			if (bornCity != null && district != null) {

				char car = 0;
				int sw = 0;
				String codiceCatastale = "", luogoNascita = "", provinciaNascita = "";

				try {
					while ((c = fis.read()) != -1) {
						car = (char) c;
						if (car != 10) {
							if (car == 13) {
								String[] result = luogoNascita.split(" ");
								luogoNascita = "";
								for (int x = 0; x < (result.length - 1); x++) {
									luogoNascita += result[x];
									if (x < (result.length - 2))
										luogoNascita += " ";
								}
								provinciaNascita += result[result.length - 1];
								this.camp[0] = codiceCatastale;
								codiceCatastale = "";
								this.camp[1] = luogoNascita;
								luogoNascita = "";
								this.camp[2] = provinciaNascita;
								provinciaNascita = "";
								sw = 0;
								if (this.camp[1].equals(bornCity.toUpperCase())
										& this.camp[2].equals(district.toUpperCase()))
									break;
							} else {
								if (codiceCatastale.length() < 4)
									codiceCatastale += car;
								else {
									if (car == 32 & sw == 0)
										sw = 1;
									else if (sw == 1)
										luogoNascita += car;
								}
							}
						}
					}
					if (c == -1);
				} catch (IOException e) {
					System.out.println(e);
					;
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return 1;
	}

}