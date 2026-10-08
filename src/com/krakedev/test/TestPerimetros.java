package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado("C1","Negro",5);
		Rectangulo r1 = new Rectangulo("R1","Gris",5,8);
		
		System.out.println(c1.calcularPerimetro());
		System.out.println(r1.calcularPerimetro());
		
	}

}
