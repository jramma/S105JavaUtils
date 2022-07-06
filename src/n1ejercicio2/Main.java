package n1ejercicio2;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String busqueda = "C:\\Users";
		File carpeta = new File("C:\\Users");
		Lector.leerRecursivamente(carpeta);
	}
}
