package com.krakedev.figuras;

public class Hexagono extends Figura {
	
	int lado;
	
	public Hexagono (String nombre, String color, int lado) {
		super(nombre,color);
		this.lado = lado;
	}
	@Override
	public int calcularPerimetro() {
		 return lado * 6;
	}
	
	@Override
	public int calcularArea() {
		return (int) (3 * Math.sqrt(3) * lado * lado) / 2;
	}
}
