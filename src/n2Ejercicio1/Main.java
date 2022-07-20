package n2Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Properties;

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
		for (int i = 0; i < listado.length; i++) {
			nombresArchivos.add(listado[i]);
		}
		Collections.sort(nombresArchivos);
		nombresArchivos.forEach(n -> System.out.println("- " + n));
		nombresArchivos.removeAll(nombresArchivos);
	}

	public static void leerRecursivamente(File carpeta) throws IOException {

		Properties p = new Properties();
		OutputStream os = new FileOutputStream("dataBusqueda.properties");
		p.setProperty("UltimaModificacion",ultimaModificacion(carpeta));
		ultimaModificacion(carpeta);
		try {
			ordenAlfabetico(carpeta);
			if (carpeta.isDirectory()) {
				System.out.println(carpeta.toString() + ">>Es un directorio D");
				p.setProperty("Directorio", carpeta.toString());
				File[] lista = carpeta.listFiles();
				for (int i = 0; i < lista.length; i++) {

					System.out.println(lista[i].getName());
					p.setProperty("Fichero", lista[i].getName());
					ultimaModificacion(lista[i]);
					System.out.println(">>es un archivo tipo F");

					if (lista[i].isDirectory()) {
						ordenAlfabetico(lista[i]);
						leerRecursivamente(lista[i]);
					}
				}

			}
		} catch (NullPointerException e) {
			e.getMessage();
		}
		p.store(os, null);

	}

	private static String ultimaModificacion(File archivo) {
		long ms = archivo.lastModified();
		Date d = new Date(ms);
		Calendar c = new GregorianCalendar();
		c.setTime(d);
		return ("Ultima modificacion " + c.get(Calendar.DATE) + " " + c.get(Calendar.MONTH) + " "
				+ c.get(Calendar.YEAR));

	}
}