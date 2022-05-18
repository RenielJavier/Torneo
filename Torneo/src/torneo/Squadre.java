
package torneo;
import java.io.*;
import java.util.*;

import mycontainers.Node;
public class Squadre {
		/*attributes*/
		private String value;
		Squadre succ;
		String colore;
		public Squadre(String value,String colore) {
			
		}
		/*public Squadre(String value,Squadre succ) {
			try {
				s= new Scanner(f2);
				while(s.hasNextLine()) {
					String f=s.nextLine();
					String[] fields=f.split(",");
					if(fields.length==2) {
						q=new Squadra(fields[0],fields[1]);
					}
				}
				this.value=value;
				this.succ=succ;
			} catch (FileNotFoundException e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
		}*/
		public Squadre getSucc() {
			return succ;
		}
		public void setSucc(Squadre succ) {
			this.succ = succ;
		}
		public void setValue(String value) {
			this.value=value;
		}
		public String getValue() {
			return value;
		}
		
		public String getColore() {
			return colore;
		}
		public void setColore(String colore) {
			this.colore = colore;
		}
		@Override
		public String toString() {
			return "Squadra [value=" + value +" colore="+colore +"]";
		}

}
