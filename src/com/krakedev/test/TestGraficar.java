package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar: Graficador, Figura, Cuadrado, Rectangulo (crear esta clase)
		Graficador grafi1 = new Graficador();
		Cuadrado c1 = new Cuadrado("CUADRADO 1", "AZUL",8);
		Rectangulo r1 = new Rectangulo("RECTANGULO 1", "GRIS",5,4);
		Triangulo t1 = new Triangulo("TRIANGULO 1", "PLOMO", 4,2,8,9,7);
		TrianguloRectangulo tr1 = new TrianguloRectangulo("TRIANGULO RECTANGULO 1","ROJO",5,4);
		Hexagono h1  = new Hexagono("Hexagono", "Verde", 5);
		
		// ● Invocar graficando
		grafi1.graficador(c1);
		grafi1.graficador(r1);
		grafi1.graficador(t1);
		grafi1.graficador(tr1);
		grafi1.graficador(h1);
	}
}
