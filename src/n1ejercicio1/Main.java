package n1ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		if (args.length > 0) {					
			ordenAlfabetico(args[0]);
			sc.close();
		} else {
			System.out.println("no especifico la ruta del archivo");
		}
	}

	private static void ordenAlfabetico(String archivo) {
		ArrayList<String> nombresArchivos = new ArrayList<String>();

		File carpeta = new File(archivo);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			System.out.println("Not found.");
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
