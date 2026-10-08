package com.krakedev.figuras;

public class Graficador {
	
	//Inclusion de metodo
	public void graficador(Figura figura) {
		System.out.println("GRAFICANDO: "+ figura.getNombre() + " DE COLOR: "+ figura.getColor());
		System.out.println("Perimetro: "+ figura.calcularPerimetro());
	}


}
