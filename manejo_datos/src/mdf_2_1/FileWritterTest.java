package mdf_2_1;
import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mdf_2_2_1.FileName;

class FileWritterTest {

	FileWritter fw = new FileWritter();
	//FileName fn = new FileName("io");
	//String dir = "C:/directorios_y_ficheros/prueba/fichero_prueba.txt";
	String dir = "C:/dev/GameEngine/Engine/src/Engine";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void crearFicheros() {
		fw.crearFicheros();
	}
	
//	@Test
//	void eliminarFicheros() {
//		fw.eliminarFicheros(new File(dir));
//	}
	
	@Test
	void mostrarInfo(File f) {
		fw.mostrarInfo(new File(dir));
	}
	
	@Test
	void showSize(File f) {
		fw.showSize(f);
	}
	
//	@Test
//	void FileName() {
//		fn.mostrarDirs(new File("C:\\dev\\p"));
//	}
	

}
