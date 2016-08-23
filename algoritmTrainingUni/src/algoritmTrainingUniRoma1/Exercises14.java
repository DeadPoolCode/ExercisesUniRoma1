/*
 * 
 * 
 * [Prodotti]    Si immagini una situazione in cui si deve gestire un archivio di prodotti 
 * merceologici di varia natura come elettrodomestici, televisori, 
 * capi di abbigliamento, ecc. Ogni oggetto dell'archivio dovrebbe 
 * rappresentare una specifica tipologia di prodotto. Ad esempio, un 
 * televisore di una certa marca e modello o una camicia di un certa marca, taglia e colore. Chiaramente ci sono degli attributi (o proprietà) che sono comuni a tutti i prodotti: prezzo e produttore. Altri attributi non sono comuni a tutti i prodotti ma appartengono a una certa categoria di prodotti. Ad esempio, il consumo in watt è comune a tutti i prodotti elettrici (elettrodomestici, televisori, ecc.). Possiamo organizzare proprio in base a queste comunanze e differenze le classi per la gestione di questo archivio. Definire una classe base Prodotto per la gestione degli attributi comuni a tutti i prodotti. Poi definire delle estensioni di tale classe per le diverse categorie specifiche di prodotti. Per mantenere l'esercizio semplice consideriamo solamente poche categorie: abbigliamento, frigoriferi e televisori. I capi di abbigliamento possono essere gestiti da una sola classe Abbigliamento. Quindi Abbigliamento sarà una sotto-classe di Prodotto. I frigoriferi e i televisori hanno alcuni attributi in comune (ad esempio, consumo in watt) però hanno anche delle differenze: la capacità ha senso solamente per i frigoriferi e la dimensione in pollici ha senso solamente per i televisori. Così conviene definire una classe intermedia AppElettr che accomuna tutti i prodotti elettrici o elettronici. È anch'essa una sotto-classe di Prodotto. Infine definire le classi Frigorifero e Televisore come sotto-classi di AppElettr. Queste classi costituiscono una piccola gerarchia che può essere visualizzata con il seguente diagramma:
 * 
 * 
 * by Carlo Giordano
 * 
 */

public class Exercises14 {

	public class Prodotti {

		int id;
		String modello;
		String marca;
		String colore;
		String nome;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getModello() {
			return modello;
		}

		public void setModello(String modello) {
			this.modello = modello;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColore() {
			return colore;
		}

		public void setColore(String colore) {
			this.colore = colore;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Prodotti(int id, String modello, String marca, String colore, String nome) {
			super();
			this.id = id;
			this.modello = modello;
			this.marca = marca;
			this.colore = colore;
			this.nome = nome;
		}

	}

	public class Abbigliamento extends Prodotti {

		String stoffa;

		public String getStoffa() {
			return stoffa;
		}

		public void setStoffa(String stoffa) {
			this.stoffa = stoffa;
		}

		public Abbigliamento(int id, String modello, String marca, String colore, String nome, String stoffa) {
			super(id, modello, marca, colore, nome);
			this.stoffa = stoffa;
		}

	}

	public class AppElettrica extends Prodotti {

		int watt;

		public int getWatt() {
			return watt;
		}

		public void setWatt(int watt) {
			this.watt = watt;
		}

		public AppElettrica(int id, String modello, String marca, String colore, String nome, int watt) {
			super(id, modello, marca, colore, nome);
			this.watt = watt;
		}

	}

	public class Frigorifero extends AppElettrica {

		int peso;

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public Frigorifero(int id, String modello, String marca, String colore, String nome, int watt, int peso) {
			super(id, modello, marca, colore, nome, watt);
			this.peso = peso;
		}

	}

	public class Televisore extends AppElettrica {

		int pollici;

		public int getPollici() {
			return pollici;
		}

		public void setPollici(int pollici) {
			this.pollici = pollici;
		}

		public Televisore(int id, String modello, String marca, String colore, String nome, int watt, int pollici) {
			super(id, modello, marca, colore, nome, watt);
			this.pollici = pollici;
		}

	}

	public static void main(String[] args) {

		int ìdT = 1;
		String modelloTv = "First";
		String marca = "Sony";
		String colore = "red";
		String nome = "Big40";
		int watt = 200;
		int pollici = 40;

		Televisore televisore = new Exercises14().new Televisore(ìdT, modelloTv, marca, colore, nome, watt, pollici);
		System.out.println("Il mio televisore ha " + televisore.getPollici() + " " + "pollici");

		int idF = 2;
		String modelloF = "MangiaTanto";
		String marcaF = "Philips";
		String coloreF = "grigio";
		String nomeF = "Ice";
		int wattF = 200;
		int peso = 300;

		Frigorifero frigorifero = new Exercises14().new Frigorifero(idF, modelloF, marcaF, coloreF, nomeF, wattF, peso);
		System.out.println("Il frigo pesa " + frigorifero.getPeso());

	}

}
