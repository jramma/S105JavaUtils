package n1ejercicio5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File archivoSer = new File("src/listaSrc.src");
		archivoSer.createNewFile();
		// serializar un array de Objeto:
		Objeto[] objetos = new Objeto[3];
		objetos[0] = new Objeto(23, "A");
		objetos[1] = new Objeto(14, "B");
		objetos[2] = new Objeto(43, "C");
		// creamos el archivo src:
		try {
			ObjectOutputStream listaSrc = new ObjectOutputStream(
					new FileOutputStream("C:\\Users\\joser\\Desktop\\srcCarpeta"));
			listaSrc.writeObject(objetos);
			listaSrc.close();
			// deserializamos el archivo src:
			ObjectInputStream recuperarObjeto = new ObjectInputStream(
					new FileInputStream("C:\\\\Users\\\\joser\\\\Desktop\\\\srcCarpeta"));
			// hay que hacer un casting porque te devuelve un tipo Object
			Objeto[] objetosDeserializados = (Objeto[]) recuperarObjeto.readObject();
			recuperarObjeto.close();
			for (int i = 0; i < 2; i++) {
				System.out.println(objetosDeserializados[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
