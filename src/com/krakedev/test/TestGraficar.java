package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar: Graficador, Figura, Cuadrado, Rectangulo (crear esta clase)
		Graficador grafi1 = new Graficador("GRAFI 1", "NEGRO");
		Figura f1 = new Figura("FIGURA 1", "BLANCO");
		Cuadrado c1 = new Cuadrado("CUADRADO 1", "AZUL",8);
		Rectangulo r1 = new Rectangulo("RECTANGULO 1", "GRIS",5,4);

		// ● Invocar graficando
		grafi1.graficador(grafi1);
		f1.graficador(f1);
		c1.graficador(c1);
		r1.graficador(r1);

	}
}
