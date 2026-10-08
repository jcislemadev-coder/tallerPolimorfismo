package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f1 = new Figura("Figuras","negro");
		Cuadrado c1 = new Cuadrado("Cuadrado","blanco");
		Triangulo t1 = new Triangulo("Triangulo","rosado");
		
		//Imprimmir los objetos
		System.out.println(f1);
		System.out.println(c1);
		System.out.println(t1);

	}

}
