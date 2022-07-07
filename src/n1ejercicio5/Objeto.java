package n1ejercicio5;

import java.io.Serializable;

public class Objeto implements Serializable {
	private int nombre;

	public Objeto(int nombre) {
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + "]";
	}
	
	
	//https://www.youtube.com/watch?v=KCpj3NE1pwI
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
