package flujo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EscrituraLecturaFichero {

	public EscrituraLecturaFichero() {
		
	}
	
	public void leeFichero() {
		try {
			FileReader fr = new FileReader("");
			int c = 0;
			while(c != -1) {
				c = fr.read();
				if (c!=-1)
					System.out.println((char) c);
			}
			fr.close();
		}catch(FileNotFoundException nfe) {
			nfe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
