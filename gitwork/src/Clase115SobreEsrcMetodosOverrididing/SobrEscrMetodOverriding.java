package Clase115SobreEsrcMetodosOverrididing;
/*============================================SOBRE ESCRITURA DE METODOS OVERRIDING======================================
 * En las clases la sobreescritura se da cuando una subclase utiliza un metodo de la clase padre, pero la "sobreescribe"
 * de manera que el metodo ahora se adecue a las caracteristicas y necesidades que tenga la subclase
 * 
 * Ejemplo: 
 * 								Clase Padre Empleado
 * 										|
 * 										|
 * 								Clase hija  Gerente
 * 
 * en la clase empleado:
 * 
 * public String obtenerDetalles(){
 * 		return nombre+puesto+nivel;
 * 	}
 * 
 * en la clase Gerente:
 * 
 * @Override
 * public String obtenerDealles(){
 * 		return nombre+puesto+nivel+departamento;
 * 	}
 * 
 * En la clase hija se anade "departamento" a el metodo.
 * 
 * NOTA:La firma de el metodo sobreescrito por una subclase debe ser igual que la del padre, en nombre, tipo de retorno y lista de argumentos.
 * Es la regla para que se cumpla y se respete la sobreescritura 
 * NOTA:Lo unico que puede variar al sobreescribir un metodo es el ACCESO, pero un metodo sobreescrito no puede ser menos accesible que el metodo
 * original.Por ejemplo, si un metodo es public en la clase padre, no puede cambiarse a potected o private en la clase hija, pero si este metodo
 * en la clase padre fuera Protected, si podria ser public en la clase hija.
 * -----PUEDE SER MENOS RESTRICTIVO EN LA CLASE HIJA, PERO NO MAS RESTRICTIVO--------
 * 
 * */
public class SobrEscrMetodOverriding {
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado("pedro",30000);
		Gerente g = new Gerente("Albert",15000,"ventas");
		
		System.out.println(e.obtenerDetalles());
		System.out.println("\n"+g.obtenerDetalles());
		
	}
}
