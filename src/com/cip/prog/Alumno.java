package com.cip.prog;

public class Alumno extends Personas {
	//Definición de atributos
	private String curso;
	
	//Definición de constructor
		public Alumno (String nombre, int anyoNacimiento, String curso) {
			super(nombre, anyoNacimiento);
			this.curso = curso;
		}
		
		//Definición de métodos
		public double calculaDescuento(double cantidad) {
			return (cantidad-(cantidad*0.1));
		}

		public String toString() {
			System.out.println("El alumno se encuentra en el curso: " + curso);
		}
		
		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
}
