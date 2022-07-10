package n1ejercicio1;

import java.io.IOException;
import java.util.Scanner;



public class Main {
static Scanner sc = new Scanner (System.in);
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// javac para compilar, java para ejecutar + ruta
		try {
		Runtime.getRuntime().exec("cmd /c start cmd.exe");	
		System.out.println("Introduce el directorio que desea ver en orden alfabético");

		Lector.ordenAlfabetico(sc.nextLine());
		}catch(IOException e) {
			e.getMessage();
		}
		
		
		
		
		
		
		
		
		
		
	
	}
}
