package n1ejercicio2;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws IOException {
		if (args.length > 0) {					
			File carpeta = new File(args[0]);
			leerRecursivamente(carpeta);
		} else {
			System.out.println("no especifico la ruta del archivo");
		}
		
		
	}

	private static void ordenAlfabetico(File archivo) {
		ArrayList<String> nombresArchivos = new ArrayList<String>();

		String[] listado = archivo.list();
		if (listado == null || listado.length == 0) {
			System.out.println("Not found.");
		} else {
			for (int i = 0; i < listado.length; i++) {
				nombresArchivos.add(listado[i]);
			}
		}
		
		Collections.sort(nombresArchivos);		
		nombresArchivos.forEach(n->  System.out.println("- " +n));

	}

	public static void leerRecursivamente(File carpeta) {
		ultimaModificacion(carpeta.toString());
		try {
			ordenAlfabetico(carpeta);
			if (carpeta.isDirectory()) {
				File[] lista = carpeta.listFiles();
				for (int i = 0; i < lista.length; i++) {

					System.out.println(lista[i].getName());
					if (lista[i].isDirectory()) {
						ordenAlfabetico(lista[i]);
						leerRecursivamente(lista[i]);
					}
				}

			}
		} catch (NullPointerException e) {
			e.getMessage();
		}

	}

	private static void ultimaModificacion(String archivo) {
		File contenido = new File(archivo);
		if (contenido.exists()) {
			if (contenido.isFile()) {
				System.out.println(contenido.toString() + "es un archivo tipo F");
			}
			if (contenido.isDirectory()) {
				System.out.println(contenido.toString() + "es un directorio tipo D");
			}
			long ms = contenido.lastModified();
			Date d = new Date(ms);
			Calendar c = new GregorianCalendar();
			c.setTime(d);
			System.out.println("Ultima modificacion " + c.get(Calendar.DATE) + " " + c.get(Calendar.MONTH) + " "
					+ c.get(Calendar.YEAR));
		} else {
			System.out.println(archivo+" no existe");
		}
	}
}
