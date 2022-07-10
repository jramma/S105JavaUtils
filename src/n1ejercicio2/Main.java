package n1ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el directorio que quieres leer recursivamente:");
		File carpeta = new File(sc.nextLine());
		Lector.leerRecursivamente(carpeta);
	}
}
