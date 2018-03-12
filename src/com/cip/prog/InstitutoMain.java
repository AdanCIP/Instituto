package com.cip.prog;

public class InstitutoMain {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor("Jonay", 1080, 2000);
		Alumno alumno1 = new Alumno ("Adán", 1991, "1ro");
		
		
		System.out.println("Un profesor que compra un artículo de 100€ paga: " + profesor1.calculaDescuento(100) + "€");
		System.out.println("Un alumno que compra un artículo de 100€ paga: " + alumno1.calculaDescuento(100) + "€");
	
	}

}
