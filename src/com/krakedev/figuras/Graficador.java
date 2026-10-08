package com.krakedev.figuras;

public class Graficador  extends Figura {
	
	public Graficador (String nombre, String color) {
		super(nombre,color);
	}

	public void graficador(Figura figura) {
		System.out.println("GRAFICANDO: "+nombre + " NOMBRE: "+color);
	}
}
