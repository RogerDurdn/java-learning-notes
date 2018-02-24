package Clase121ConversionDObjetosCasting;

public class Gerente extends Empleado {

	private String departamento;
	
	public Gerente(String nombre,int sueldo,String departamento) {
		
		super(nombre,sueldo);
		
		this.departamento = departamento;
	}
	public String getDepartamento() {
		return departamento;
	}
	@Override
	public String obtenerDetalles() {
		
		return super.obtenerDetalles()+"\nDepartamento:"+departamento;
	}
	
}
