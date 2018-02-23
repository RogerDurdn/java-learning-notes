package Clase115SobreEsrcMetodosOverrididing;

public class Empleado {

	private int sueldo;
	private String nombre;
	
	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String obtenerDetalles() {
		return "Nombre:"+nombre+"\nSueldo:"+sueldo;
	}
}
