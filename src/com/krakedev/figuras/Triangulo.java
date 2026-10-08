package com.krakedev.figuras;

public class Triangulo extends Figura {

	int ladoA;
	int ladoB;
	int ladoC;

	public Triangulo(String nombre, String color, int ladoA, int ladoB, int ladoC) {
		super(nombre, color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	@Override

	public int calcularPerimetro() {
		return ladoA + ladoB + ladoC;
	}

}
