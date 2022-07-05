package n1ejercicio1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lector {
	static Scanner sc = new Scanner(System.in);

	public static void ordenAlfabetico(String archivo) {
		ArrayList<String> nombresArchivos = new ArrayList<String>();

		File carpeta = new File(archivo);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
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
