package n1ejercicio4;

//import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué txt deseea leer? (ej: src/busqueda.txt)");
		Lector.leerTxt(sc.nextLine());
		sc.close();
	}
}
