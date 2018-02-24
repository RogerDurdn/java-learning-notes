package Clase121ConversionDObjetosCasting;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		Empleado emp;
		
		emp = new Escritor("Juan",20000,TipoEscritura.CLASICO);
		
		//emp.obtenerDetalles();
		
		imprimirDetalles(emp);
		
		emp = new Gerente("Alber",10000,"ventas");
		
		imprimirDetalles(emp);
		
	}
	public static void imprimirDetalles(Empleado empleado) {
		
		String resultado = null;
		
		System.out.println("\nDetalles"+empleado.obtenerDetalles());
		
		if(empleado instanceof Escritor) {
			
		/*	Escritor escritor = (Escritor) empleado;
			
			resultado = escritor.getTipoEscritura();
		*/
			//Sintaxis abreviada para evitar hacer variables innesesarias
		resultado = ((Escritor)empleado).tipoEscritura.getDescripcion();
		
		System.out.println("resultado tipo de escritura:"+resultado);
		}else if(empleado instanceof Gerente) {
			resultado = ((Gerente)empleado).getDepartamento();
			
			System.out.println("resultado de departamento:"+resultado);
		
		}
		
		
	}
}
