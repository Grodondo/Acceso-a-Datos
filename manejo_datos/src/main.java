import java.io.File;
import java.io.IOException;

import mdf_2_1.FileWritter;
import mdf_2_2_1.FileName;

public class main {

	public static void main(String[] args) {

		FileWritter fileW = new FileWritter();
		//fileW.run();

		//FileName fileN = new FileName(new File("C:\\dev\\p"), "in");
		//fileN.mostrarDirs();
		
//		File f = new File(".");
//		infoF(f);
	}

	public static void infoF (File f) {
		File Files[] = f.listFiles();
		
		for(int i=0; i<Files.length; i++) {
			String tipo = ((Files[i].isFile()) ? "fichero" : "archivo");
			System.out.println("Nombre del " + tipo + ": " + Files[i].getName());
		}
	}
	
}
