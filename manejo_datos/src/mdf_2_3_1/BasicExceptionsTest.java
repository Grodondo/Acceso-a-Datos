package mdf_2_3_1;

import java.io.File;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BasicExceptionsTest {
	
	private BasicExceptions be;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Test iniciado");
	}

	@Test
	void cambiarNombreFichero()  {
		//be.cambiarNombreFichero(new File("C:/dev/Trash/"), "C:/dev/Trash", "fichero2.txt");
		Assertions.assertThrows(FileNoReference.class, () -> {
			be.cambiarNombreFichero(new File("C:/dev/Trash/"), "C:/dev/Trash", "fichero2.txt");
		});
	}
	
	@Test
	void crearFicheroTxt2() throws DirNoReference {
		BasicExceptions.crearFicheroTxt2(new File("C:/dev/Trash/fichero1.txt"), "fichero1");
	}

}
