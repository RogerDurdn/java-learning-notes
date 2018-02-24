package Clase121ConversionDObjetosCasting;

public class Escritor extends Empleado {

	final TipoEscritura tipoEscritura;
	
	public Escritor(String nombre, int sueldo,TipoEscritura tipoEscritura ) {
		super(nombre,sueldo);
		this.tipoEscritura = tipoEscritura;
	}
	public String getTipoEscritura() {
		return tipoEscritura.getDescripcion();
	}
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles()+"\nTipo de escritura:"+tipoEscritura.getDescripcion();
	}
	
}
