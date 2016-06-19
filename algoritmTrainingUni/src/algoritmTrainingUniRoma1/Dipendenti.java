/*
 *  
 * [ControlloArgomenti] Aggiungere ai metodi e ai costruttori della classe Dipendente 
 * i seguenti controlli sugli argomenti: indirizzo, telefono e nomeCognome non devono essere null, 
 * stipendio non deve essere negativo, telefono deve contenere solamente caratteri che sono o cifre 0-9 o lo spazio, nomeCognome deve contenere solamente 
 * caratteri che sono o lettere o lo spazio o l'apice (per determinare se un carattere è una lettera si può usare Character.isLetter).
 *
 * by Carlo Giordano
 * 
 */

public class Dipendenti {

	String indirizzo;
	String nomeCognome;
	Double stipendio;
	Long codice;
	String telefono;

	public String getNomeCognome() {
		return nomeCognome;
	}

	public void setNomeCognome(String nomeCognome) {
		try {
			if (nomeCognome != null) {
				if (testChar(nomeCognome) == true) {
					this.nomeCognome = nomeCognome;
				}
			}
		} catch (Exception e) {
			System.out.println("Not null Please");
		}

	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(Double stipendio) {
		try {
			if (stipendio != -1) {
				this.stipendio = stipendio;
			}
		} catch (Exception e) {
			System.out.println("Not null Please");
		}
	}

	public long getCodice() {
		return codice;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {

		try {
			if (indirizzo != null) {
				this.indirizzo = indirizzo;
			}
		} catch (Exception e) {
			System.out.println("Not null Please");
		}

	}

	public void setCodice(Long codice) {

		try {
			if (codice != null) {
				this.codice = codice;
			}
		} catch (Exception e) {
			System.out.println("Not null Please");
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {

		try {
			if (telefono != null) {
				if (telefono.matches(("[0-9].*")))
					this.telefono = telefono;
			}

		} catch (Exception e) {
			System.out.println("Not null Please");
		}
	}

	public boolean testChar(String s) {
		boolean res = false;
		try {
			if (s != null) {
				char[] tempA = s.toCharArray();
				for (int i = 0; i < tempA.length; i++) {
					char c = tempA[i];
					if (Character.isWhitespace(c) == false) {
						if (Character.isLetter(c) == false) {
							res = false;
							break;
						}
					}
					res = true;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("String null!!!!!!!!!!!");
		}
		return res;
	}

	public Dipendenti() {
	}

	public static void main(String[] args) {

		String indirizzo = "Via Verdi";
		String nomeCognome = "Carlo Giordano";
		Double stipendio = 1000d;
		Long codice = 122l;
		String telefono = "060 258598";

		Dipendenti dipendenti = new Dipendenti();

		dipendenti.setCodice(codice);
		dipendenti.setIndirizzo(indirizzo);
		dipendenti.setNomeCognome(nomeCognome);
		dipendenti.setTelefono(telefono);
		dipendenti.setStipendio(stipendio);

		System.out.println("Nome Congnome " + dipendenti.getNomeCognome() + " " + "Stipendio "
				+ dipendenti.getStipendio() + " " + "Indirizzo " + dipendenti.getIndirizzo() + " " + "Codice "
				+ dipendenti.getCodice() + " " + "Numero di Telefono " + dipendenti.getTelefono());

	}
}
