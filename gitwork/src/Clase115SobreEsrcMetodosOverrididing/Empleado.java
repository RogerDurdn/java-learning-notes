package Clase115SobreEsrcMetodosOverrididing;

public class Empleado {

	private int sueldo;
	private String nombre;
	
	protected Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	protected String obtenerDetalles() {
		return "Nombre:"+nombre+"\nSueldo:"+sueldo;
	}
}
