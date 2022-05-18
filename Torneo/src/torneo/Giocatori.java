package torneo;
import java.io.*;
import java.util.*;
public class Giocatori{
	Giocatore g;
	ArrayList<Giocatore> alst;
	public Giocatori() {
		File f1=new File("Giocatori.csv");
		alst=new ArrayList<Giocatore>();
		Scanner l;
		try { 
			l = new Scanner(f1);
			while(l.hasNext()) {
				for(int i=0;i<16;i++) {
					String s=l.nextLine();
					String[] fields=s.split(",");
					if(fields.length==3) {
						alst.add(new Giocatore(fields[0],fields[1],fields[2]));
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Giocatori:"+alst+"\n";
	}
	
	
}
