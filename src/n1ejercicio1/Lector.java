package n1ejercicio1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Lector {
		
	public static void ordenAlfabetico(String archivo) {
		ArrayList<String> nombresArchivos = new ArrayList<String>();

		File carpeta = new File(archivo);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			System.out.println("Not found.");
			return;
		} else {
			for (int i = 0; i < listado.length; i++) {
				nombresArchivos.add(listado[i]);
			}
		}
		Collections.sort(nombresArchivos);
		System.out.println("En orden alfabético");
		System.out.println(nombresArchivos);

	}
}
