package mycontainers;
import java.io.*;
import java.util.*;
import torneo.Squadre;

public class Lista {
	private Squadre start;
	public Lista() {
		start=null;
	}
	public void add(){
		File f2=new File("Squadre.csv");
		Squadre n;
		try {
			Scanner s= new Scanner(f2);
			while(s.hasNextLine()) {
				String f=s.nextLine();
				String[] fields=f.split(",");
				if(fields.length==2) {
					n=new Squadre(fields[0],fields[1]);
					if(start==null) {start=n; return;}
					Squadre p= start;
					while(p.getSucc()!=null) {p=p.getSucc();}
					p.setSucc(n);
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	public String toString() {
		String s="";
		Squadre p=start;
		while(p!=null){
			s+=p.getValue()+" "+p.getColore()+"";
			p=p.getSucc();
		}
		return s;
	}
}
