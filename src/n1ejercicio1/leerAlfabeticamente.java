package n1ejercicio1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://www.campusmvp.es/recursos/post/java-como-listar-filtrar-y-obtener-informacion-de-carpetas-y-archivos.aspx
public class leerAlfabeticamente {
	static Scanner sc = new Scanner(System.in);

	public static void ordenAlfabetico(String archivo) {
		ArrayList<String> palabras = new ArrayList<String>();

		File carpeta = new File(archivo);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		} else {
			for (int i = 0; i < listado.length; i++) {
				System.out.println(listado[i]);
				palabras.add(listado[i]);
			}
		}
		Collections.sort(palabras);
		System.out.println(palabras);

	}

}
