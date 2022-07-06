package n1ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lector {
	static Scanner sc = new Scanner(System.in);

	public static void ordenAlfabetico(File carpeta) throws IOException {
		ArrayList<String> nombresArchivos = new ArrayList<String>();
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			escribirTxt("No hay elementos dentro de la carpeta actual");
			nombresArchivos = new ArrayList<String>();
		} else {
			for (int i = 0; i < listado.length; i++) {
				nombresArchivos.add(listado[i]);
			}
		}
		Collections.sort(nombresArchivos);
		escribirTxt("CONTENIDO ORDENADO ALFABETICAMENTE>");
		escribirTxt(nombresArchivos.toString());
	}

	public static void leerRecursivamente(File carpeta) throws IOException {
		ultimaModificacion(carpeta.toString());
		try {
			ordenAlfabetico(carpeta);
			if (carpeta.isDirectory()) {
				File[] lista = carpeta.listFiles();
				for (int i = 0; i < lista.length; i++) {

					escribirTxt(lista[i].getName());
					if (lista[i].isDirectory()) {
						escribirTxt("***Contiene>>>");
						ordenAlfabetico(lista[i]);
						leerRecursivamente(lista[i]);
					}
				}

			}
		} catch (NullPointerException e) {
			e.getMessage();
		}

	}

	private static void ultimaModificacion(String archivo) throws IOException {
		File contenido = new File(archivo);
		if (contenido.exists()) {
			if (contenido.isFile()) {
				escribirTxt(contenido.toString() + "es un archivo tipo F");
			}
			if (contenido.isDirectory()) {
				escribirTxt(contenido.toString() + "es un directorio tipo D");
			}
			long ms = contenido.lastModified();
			Date d = new Date(ms);
			Calendar c = new GregorianCalendar();
			c.setTime(d);
			escribirTxt("Ultima modificacion " + c.get(Calendar.DATE) + " " + c.get(Calendar.MONTH) + " "
					+ c.get(Calendar.YEAR));
		} else {
			escribirTxt("no existe");
		}
	}

	private static void escribirTxt(String texto) throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("src/busqueda.txt", true);
			pw = new PrintWriter(fichero);
			pw.write("- " +texto + ".\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fichero.close();

				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		pw.close();

	}
	

}




