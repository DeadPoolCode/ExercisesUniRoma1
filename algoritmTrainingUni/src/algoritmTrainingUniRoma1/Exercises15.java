import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.sql.rowset.spi.TransactionalWriter;

/*
 * 
 * [Biblioteca]    Si vuole gestire un archivio dei documenti (libri e DVD) di una biblioteca. Ogni documento ha una collocazione. Prima di tutto definire quindi una classe Collocazione per gestire 
 * appunto le collocazioni. Una collocazione è determinata da una stringa che specifica il nome di un reparto della biblioteca, un numero di 
 * scaffale che identifica uno scaffale del reparto e da un numero che indica una posizione nello scaffale. Poi, definire una gerarchia di classi con una classe base 
 * Documento e poi le sotto-classi Libro, DVD_Video e DVD_Audio. I dati comuni devono essere gestiti dalla classe Documento (come la collocazione). Definire opportuni costruttori e metodi getter e setter per i vari 
 * dati (autore, titolo, ecc.). Ridefinire in modo opportuno i metodi equals e toString. Definire un metodo statico cercaTitoli della classe Documento che prende in input un array arrD di oggetti Documento e una stringa str e ritorna in un array di oggetti Documento tutti i documenti dell'array arrD il cui titolo contiene la stringa str.
 * 
 * By Carlo Giordano
 * 
 * 
 */

public class Exercises15 {

	public class Collezione {

		String department;
		Integer numberSection;

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public Integer getNumberSection() {
			return numberSection;
		}

		public void setNumberSection(Integer numberSection) {
			this.numberSection = numberSection;
		}

		public Collezione(String department, Integer numberSection) {
			super();
			this.department = department;
			this.numberSection = numberSection;
		}

	}

	public class Document extends Collezione {

		int id;
		String author;
		String title;
		Date firstDate;

		public int getId() {
			return id;
		}

		public void setId(int id) {

			if (id == 0) {
				throw new IllegalArgumentException();
			}

			this.id = id;
		}

		public String getAuthor() {
			return author;
		}

		public void setAutor(String author) {
			this.author = author;
		}

		public Date getFirstDate() {
			return firstDate;
		}

		public void setFirstDate(Date firstDate) {
			this.firstDate = firstDate;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Document(String department, Integer numberSection, int id, String author, String title, Date firstDate) {
			super(department, numberSection);
			this.id = id;
			this.author = author;
			this.title = title;
			this.firstDate = firstDate;
		}

		public List<Document> docSearch(List<Document> documents, String str) {

			List<Document> listDocument = new ArrayList<Document>();
			try {
				if (documents != null || str != null) {
					for (Document document : documents) {
						if (document.title == str) {
							listDocument.add(document);
						}
					}
				}
			} catch (NullPointerException e) {
				System.out.println("Null error");
			}
			return listDocument;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null || obj.getClass() != getClass())
				return false;

			Document docuement = (Document) obj;

			return (Objects.equals(docuement.author, author) && Objects.equals(docuement.firstDate, firstDate)
					&& Objects.equals(docuement.title, title));

		}

		@Override
		public String toString() {
			return getClass().getName() + "author" + author + "firstDate" + firstDate + "title" + title;
		}

	}

	public class Book extends Document {

		String labelBook;

		public String getLabelBook() {
			return labelBook;
		}

		public void setLabelBook(String labelBook) {
			this.labelBook = labelBook;
		}

		public Book(String department, Integer numberSection, int id, String author, String title, Date firstDate,
				String labelBook) {
			super(department, numberSection, id, author, title, firstDate);
			this.labelBook = labelBook;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null || obj.getClass() != getClass())
				return false;

			Book book = (Book) obj;

			return (Objects.equals(book.labelBook, labelBook));
		}

		@Override
		public String toString() {
			return getClass().getName() + "author" + author + "firstDate" + firstDate + "title" + title + "label"
					+ labelBook;
		}

	}

	public class DvdVideo extends Document {

		String dvdVideo;

		public String getDvdVideo() {
			return dvdVideo;
		}

		public void setDvdVideo(String dvdVideo) {
			this.dvdVideo = dvdVideo;
		}

		public DvdVideo(String department, Integer numberSection, int id, String author, String title, Date firstDate,
				String dvdVideo) {
			super(department, numberSection, id, author, title, firstDate);
			this.dvdVideo = dvdVideo;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null || obj.getClass() != getClass())
				return false;

			DvdVideo dvdV = (DvdVideo) obj;

			return (Objects.equals(dvdV.dvdVideo, dvdV));
		}

		@Override
		public String toString() {
			return getClass().getName() + "author" + author + "firstDate" + firstDate + "title" + title + "dvdVideo"
					+ dvdVideo;
		}

	}

	public class DvdAudio extends Document {

		String dvdAudio;

		public String getDvdAudio() {
			return dvdAudio;
		}

		public void setDvdAudio(String dvdAudio) {
			this.dvdAudio = dvdAudio;
		}

		public DvdAudio(String department, Integer numberSection, int id, String autor, String title, Date firstDate,
				String dvdAudio) {
			super(department, numberSection, id, autor, title, firstDate);
			this.dvdAudio = dvdAudio;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null || obj.getClass() != getClass())
				return false;

			DvdAudio dvdA = (DvdAudio) obj;

			return (Objects.equals(dvdA.dvdAudio, dvdAudio));
		}

		@Override
		public String toString() {
			return getClass().getName() + "author" + author + "firstDate" + firstDate + "title" + title + "dvdAudio"
					+ dvdAudio;
		}

	}

	@SuppressWarnings("null")
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int id = 1;
		int id2 = 2;
		int id3 = 3;

		String departmentA = "C";
		Integer numberSectionA = 1;
		String authorA = "Ciccio";
		String titleA = "title";
		Date firstDateA = null;
		String labelBookA = "labelBook";

		String departmentB = "C";
		Integer numberSectionB = 1;
		String authorB = "CiccioB";
		String titleB = "titleb";
		Date firstDateB = null;
		String dvdVideoL = "labelVideo";

		String departmentC = "C";
		Integer numberSectionC = 1;
		String autorC = "CiccioC";
		String titleC= "titleC";
		Date firstDateC = null;
		String dvdAudioL = "labelAudio";

		Book book = new Exercises15().new Book(departmentA, numberSectionA, id, authorA, titleA, firstDateA,
				labelBookA);
		DvdVideo dvdVideo = new Exercises15().new DvdVideo(departmentB, numberSectionB, id2, authorB, titleB,
				firstDateB, dvdVideoL);
		DvdAudio dvdAudio = new Exercises15().new DvdAudio(departmentC, numberSectionC, id3, autorC, titleC, firstDateC,
				dvdAudioL);

		List<Document> documents = new ArrayList<Document>();

		documents.add(book);
		documents.add(dvdVideo);
		documents.add(dvdAudio);
		String testS = "titleC";

		List<Document> testDocument = dvdAudio.docSearch(documents, testS);
	
		if (testDocument.size() == 1) {
			System.out.println("OK");
		}

		System.out.println(book.author);
		System.out.println(dvdVideo.author);
		System.out.println(dvdAudio.author);

	}

}
