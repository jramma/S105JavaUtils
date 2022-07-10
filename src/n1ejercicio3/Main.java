package n1ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el directorio del que desea escribir el txt:");		
		File carpeta = new File(sc.nextLine());
		Lector.leerRecursivamente(carpeta);
		
		
		
		
		
		
	}
}
