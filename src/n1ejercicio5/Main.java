package n1ejercicio5;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File archivoSer = new File ("src/listaSrc.src");
		archivoSer.createNewFile();
		
		for(int i = 0; i<10;i++) {
			Objeto objeto = new Objeto (23);
		}
		
		
	}
}
