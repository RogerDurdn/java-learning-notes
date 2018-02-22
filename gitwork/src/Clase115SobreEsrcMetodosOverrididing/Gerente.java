package Clase115SobreEsrcMetodosOverrididing;

public class Gerente extends Empleado {

	String departamento;
	
	public Gerente(String nombre,int sueldo, String departamento) {
		super(nombre,sueldo);
		this.departamento = departamento;
		
	}
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles()+"\ndepartamento:"+departamento;
	}
}
