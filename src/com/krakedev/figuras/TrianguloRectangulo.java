package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {
	int catetoA;
	int catetoB;
	double hipotenusa;

	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.sqrt((catetoA*catetoA) + (catetoB*catetoB));
	}

	@Override

	public int calcularPerimetro() {
		return (int) (catetoA + catetoB + hipotenusa);

	}

	@Override
	public int calcularArea() {
		return ((catetoA * catetoB) / 2);
	}
}
