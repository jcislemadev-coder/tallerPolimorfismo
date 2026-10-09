package com.krakedev.figuras;

public class Triangulo extends Figura {

	int ladoA;
	int ladoB;
	int ladoC;
	int base;
	int altura;

	public Triangulo(String nombre, String color, int ladoA, int ladoB, int ladoC, int base, int altura) {
		super(nombre, color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.base = base;
		this.altura = altura;
	}

	@Override

	public int calcularPerimetro() {
		return ladoA + ladoB + ladoC;
	}

	@Override
	public double calcularArea() {
		return ((base * altura)/2);
	}

}
