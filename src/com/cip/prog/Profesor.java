package com.cip.prog;

public class Profesor extends Personas {
	
	//Definición de atributos
	private double salario;
	
	//Definición de constructor
	public Profesor (String nombre, int anyoNacimiento, double salario) {
		super(nombre, anyoNacimiento);
		this.salario = salario;
	}
	
	//Definición de métodos
	public double calculaDescuento(double cantidad) {
		return (cantidad-(cantidad*0.02));
	}
	
	public String toString() {
		System.out.println("El profesor tiene un salario de: " + salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
