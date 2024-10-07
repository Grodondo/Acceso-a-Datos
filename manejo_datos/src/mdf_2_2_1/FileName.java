package mdf_2_2_1;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileName implements FilenameFilter{

	String cadena;
	
	public FileName(String cadena) {
		this.cadena = cadena;
	}
	
	@Override
	public boolean accept(File dir, String word) {
		return (dir.isDirectory() && dir.getName().contains(word));
	}
	
	
	public void mostrarDirs(File dir) {
		
		ArrayList<String> listaDir = new ArrayList<String>();
		
		if(dir.exists()) {
			String[] elements = dir.list(new FileName(this.cadena));
			
			for(String e : elements) {
				if (e.contains(this.cadena)) listaDir.add(e);
			}
			
			if(listaDir.size() == 0) System.out.println("No existe");
			else {
				for(String d : listaDir) {
					System.out.print(d + " ");
				}
			}
		}
		
	}

	
	
}
