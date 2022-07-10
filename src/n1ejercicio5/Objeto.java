package n1ejercicio5;

import java.io.Serializable;

public class Objeto implements Serializable {
	private int nombre;
	private String a;

	public Objeto(int nombre, String a) {
		this.nombre = nombre;
		this.a = a;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre +"a>"+a+ "]";
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	
	//https://www.youtube.com/watch?v=KCpj3NE1pwI
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
