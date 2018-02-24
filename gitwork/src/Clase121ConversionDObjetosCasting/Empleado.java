package Clase121ConversionDObjetosCasting;

public class Empleado {
	
	protected String nombre;
	protected int sueldo;
	
	public Empleado() {
		
	}
	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo= sueldo;
	}
	public String obtenerDetalles() {
		return "Nombre:"+nombre+"\nSueldo:"+sueldo;
	}
}
