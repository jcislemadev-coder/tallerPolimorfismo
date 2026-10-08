package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar: Graficador, Figura, Cuadrado, Rectangulo (crear esta clase)
		Graficador grafi1 = new Graficador();
		Cuadrado c1 = new Cuadrado("CUADRADO 1", "AZUL",8);
		Rectangulo r1 = new Rectangulo("RECTANGULO 1", "GRIS",5,4);

		// ● Invocar graficando
		grafi1.graficador(c1);
		grafi1.graficador(r1);
	}
}
