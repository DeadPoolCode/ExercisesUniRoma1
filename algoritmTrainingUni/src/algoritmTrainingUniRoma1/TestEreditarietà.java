import javax.sql.rowset.spi.TransactionalWriter;

/*
 * 
 * 
 *  Nell'ipotetica azienda si vogliono gestire anche i dati di collaboratori esterni come i consulenti. 
 *  Alcuni dei dati gestiti dalla classe Dipendente sono in comune con quelli gestiti da una nuova classe Consulente 
 *  (dati anagrafici, contatti). Per evitare duplicazione di codice e gestire quindi in modo unitario tali dati si decide di introdurre un'ulteriore classe Persona per gestire tali dati, da cui saranno derivate le classi Dipendente e Consulente. La ristrutturazione richiede in particolare di muovere la classe annidata Contatti da Dipendente a Persona. Per i consulenti gestire anche il curriculum 
 *  tramite un campo di tipo stringa con i relativi getter e setter.
 * 
 * 
 * 
 * 
 */

public class TestEreditarietà {

	public class Persona {

		int id;
		String name;
		String surname;

		public Persona(int id, String name, String surname) {
			super();
			this.id = id;
			this.name = name;
			this.surname = surname;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			if (id != 0) {
				throw new IllegalArgumentException();
			}
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

	}

	public class Contatti extends Persona {

		Integer telephoneNumber;

		public Integer getTelephoneNumber() {
			return telephoneNumber;
		}

		public void setTelephoneNumber(Integer telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}

		public Contatti(int id, String name, String surname, Integer telephoneNumber) {
			super(id, name, surname);
			this.telephoneNumber = telephoneNumber;
		}

	}

	public class Dipendente extends Contatti {

		Integer stipendio;

		public Integer getStipendio() {
			return stipendio;
		}

		public void setStipendio(Integer stipendio) {
			this.stipendio = stipendio;
		}

		public Dipendente(int id, String name, String surname, Integer numeroTelefono, Integer stipendio) {
			super(id, name, surname, numeroTelefono);
			this.stipendio = stipendio;
		}

	}

	public class Consulente extends Contatti {

		private String cv;

		public String getCv() {
			return cv;
		}

		public void setCv(String cv) {
			this.cv = cv;
		}

		public Consulente(int id, String name, String surname, Integer numeroTelefono, String cv) {
			super(id, name, surname, numeroTelefono);
			this.cv = cv;
		}

	}

	public static void main(String[] args) {

		int id = 1;
		String nameC = "Carlo";
		String surnameC = "Gio";
		String cvC = "Java";
		Integer telephoneNumberC = 02342455;

		Consulente consulente = new TestEreditarietà().new Consulente(id, nameC, surnameC, telephoneNumberC, cvC);

		int idC = 2;
		String nameD = "Marco";
		String surnameD = "Gio";
		Integer stipendioD = 1200;
		Integer telephoneNumberD = 03;

		Dipendente dipendente = new TestEreditarietà().new Dipendente(idC, nameD, surnameD, telephoneNumberD,
				stipendioD);

		System.out.println("Consulente : " + consulente.getName());
		System.out.println("Dipente : " + dipendente.getName());

	}

}
