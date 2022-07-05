package n1ejericio2;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		String busqueda = "C:\\Users";

		ArrayList busquedaOrdenada = Lector.ordenAlfabetico(busqueda);

		System.out.println(busquedaOrdenada);
		// leer el contenido de cada archivo:
		System.out.println("-----------------------------------------");
		Lector.leerRecursivamente(busqueda);
	}
}
