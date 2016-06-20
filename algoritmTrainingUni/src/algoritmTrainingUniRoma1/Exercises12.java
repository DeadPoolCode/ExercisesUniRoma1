
/*
 * 
 * [PiùContatti]  Migliorare la classe Contatti aggiungendo un indirizzo email e anche la possibilità di specificare 
 * fino a 5 recapiti telefonici. Definire però un solo metodo getter e un solo metodo setter che permettano, rispettivamente, di leggere e 
 * impostare ognuno dei 5 possibili recapiti telefonici, uno alla volta.
 * 
 * by Carlo Giordano
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Exercises12 {

	public static class Contatti {

		private String indirizzo;
		private List<String> telefono = new ArrayList<String>(5);
		private String email;

		public String getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}

		public List<String> getTelefono() {
			return telefono;
		}

		public void setTelefono(String tel, Integer position) {
			telefono.add(position, tel);
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Contatti(String indirizzo, List<String> telefono, String email) {
			super();
			this.indirizzo = indirizzo;
			this.telefono = telefono;
			this.email = email;
		}
	}

	public static void main(String[] args) {

		String indirizzo = null;
		List<String> telefono = new ArrayList<String>();
		String email = null;

		Contatti contatti = new Contatti(indirizzo, telefono, email);

		contatti.setIndirizzo("Via Cremona");
		contatti.setTelefono("060256895", 0);
		contatti.setEmail("ciao@gmail.com");

		System.out.print("Indirizzo :" + contatti.getIndirizzo() + "," + " Numero di telefono : "
				+ contatti.getTelefono().get(0) + "," + " Indirizzo mail " + contatti.getEmail());
		;

	}
}