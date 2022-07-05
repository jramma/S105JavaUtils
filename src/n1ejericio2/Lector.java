package n1ejericio2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lector {
	static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> ordenAlfabetico(String archivo) {
		ArrayList<String> nombresArchivos = new ArrayList<String>();

		File carpeta = new File(archivo);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			nombresArchivos = null;
		} else {
			for (int i = 0; i < listado.length; i++) {
				nombresArchivos.add(listado[i]);
			}
		}
		Collections.sort(nombresArchivos);
		return nombresArchivos;

	}
	public static void leerRecursivamente(String archivo) {
		
		ArrayList<String> busquedaOrdenada = Lector.ordenAlfabetico(archivo);
		
		for(int i = 0; i<busquedaOrdenada.size();i++) {
			System.out.println(busquedaOrdenada.get(i));
			System.out.println(" Contiene:");
			ArrayList<String> contenido = Lector.ordenAlfabetico(archivo+"\\" +busquedaOrdenada.get(i));
			if(contenido!=null) {
				for(int j = 0; j<contenido.size();j++) {
				System.out.println((String) contenido.get(i));
				leerRecursivamente((String) contenido.get(i));
				
				}
			}
		
		}
		
		
		
	}
}
