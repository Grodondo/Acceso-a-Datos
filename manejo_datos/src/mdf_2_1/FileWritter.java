package mdf_2_1;
import java.io.File;
import java.io.IOException;

public class FileWritter {

	public static String pathDir = "C:/directorios_y_ficheros/prueba";
	public static String pathFile = "/fichero_prueba.txt";
	private File f = new File(pathDir + pathFile);
	private File dir = new File(pathDir);;
	
	public void run() {
		//crearFicheros();
		//mostrarInfo(f);
		//eliminarFicheros(f);
		//showSize(new File("C:/directorios_y_ficheros/prueba/fichero_prueba.txt"));
		showSize(new File("C:\\dev\\GameEngine\\Engine\\src\\Engine\\core.h"));
		
	}
	
	public void crearFicheros() {
		if(!f.exists()) {
			dir.mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else System.out.println("Ya existe el fichero: " + pathDir + pathFile);
		
	}
	
	public void eliminarFicheros(File f) {
		if(f.getParent() != null) {
			File parentF = f.getParentFile();
			f.delete();
			eliminarFicheros(parentF);
		}
		else {
			System.out.println("Eliminacion completada");
		}
	}
	
	public void mostrarInfo(File f) {
		if(f.exists()) {
			System.out.println("\n--DATOS-DEL-FICHERO--");
			System.out.println(String.format("%20s",
					"Nombre del fichero: " + f.getName() + "\n" +
					"Ruta del fichero: " + f.getPath() + "\n" +
					"Ruta absoluta del fichero: " + f.getAbsolutePath() + "\n" +
					"El fichero " + (f.canRead() ? "admite" : "no admite") + " lectura" + "\n" +
					"El fichero " + (f.canWrite() ? "admite" : "no admite") + " escritura" + "\n" +
					"Tamaño del fichero: " + (f.length()/Math.pow(10, 6)) + "-MB\n" + 
					"Nombre del directorio padre: " + f.getParent() + "\n"
				));
		}
	}
	
	
	public Long sizeTotal = (long) 0;
	public String parentToAvoid;
	public void showSize(File f) {
		if(f!=null) {
		if(f.exists()) {
			
			String[] files = f.list();
			int sizeF = 0;
			File parentF = f.getParentFile();
			
			if(files != null) {
			for(int i=0; i<files.length; i++) {
				File newFile = new File(f.getAbsolutePath() + "/" + files[i]);
				//System.out.print("\nB   " + newFile.getAbsolutePath() + " " + newFile.length() + " ");
				if(newFile.isFile())
					sizeF += newFile.length();
				else {
					size = (long) 0;
					if(f.getName() != parentToAvoid)
						
						sizeF += showSizeForward(newFile);
					
				}
			}}else sizeF += f.length();
			
			sizeTotal += sizeF;
			
			if(f.getParent() != null) {
				System.out.println("Tamaño del " + (f.isDirectory() ? "directorio" : "archivo") + " " + f.getName() + " es " + (double) (Math.round(sizeF/Math.pow(1024, 2)*10000000.0)/10000000.0) + "-MB" );
				parentToAvoid = f.getName();
				showSize(parentF);
			}
			else System.out.println("Revision completa\n");
		}}
	}

	Long size = (long)0;
	public Long showSizeForward(File f) {
		if(f.exists()) {
			String[] files = f.list();
	
			if(files != null) {
				for(int i=0; i<files.length; i++) {
					File newFile = new File(f.getAbsolutePath() + "/" + files[i]);
					
					//System.out.print("\nF    " + newFile.getAbsolutePath() + " " + newFile.length() + " ");
					
					if(newFile.isFile())
						size += newFile.length();
					else 
						showSizeForward(newFile);
				}
			}
		}
		return size;
	}
	
}
