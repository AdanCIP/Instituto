package com.cip.prog;

public abstract class Personas {
	
		//----- ATRIBUTOS ---------------------------------
			private String nombre;
			private int anyoNacimiento;
			
			
		//----- CONSUTRCTORES ------------------------------
			public Personas() {
				this("sin nombre", 9999);
			}
			
			public Personas(String nombre, int anyoNacimiento) {
				this.nombre = nombre;
				this.anyoNacimiento = anyoNacimiento;
			}
			
		//----- MÉTODOS -----------------------
			abstract public double calculaDescuento();

			public String toString() {
				System.out.println("La persona con nombre: " + nombre + " nacio en: " + anyoNacimiento);
			}
			
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public int getAnyoNacimiento() {
				return anyoNacimiento;
			}

			public void setAnyoNacimiento(int anyoNacimiento) {
				this.anyoNacimiento = anyoNacimiento;
			}

	
	
}
