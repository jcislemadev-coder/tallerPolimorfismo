package com.krakedev.figuras;

public class Figura {
	String nombre;
	String color;
	
	//Inclusion de Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Sobrescritura del metodo toString
	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	
	

}
