package torneo;
import java.io.*;
import java.util.*;
public class Giocatore {
	String squadra, nome, cognome;
	public Giocatore(String squadra,String nome,String cognome) {
		this.cognome=cognome;
		this.nome=nome;
		this.squadra=squadra;
		/*File f1=new File("Giocatori.csv");
		ArrayList<Giocatore> alst=new ArrayList<Giocatore>();
		Scanner l;
		try {
			l = new Scanner(f1);
			while(l.hasNextLine()) {
				String s=l.nextLine();
				String[] fields=s.split(",");
				if(fields.length==3) {
					Giocatore g=new Giocatore(fields[0],fields[1],fields[2]);
					alst.add(g);
				}
				l.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		*/
	}
	public String toString() {
		return " "+nome+" "+cognome+" dei "+squadra;
	}
}
