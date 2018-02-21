package Clase106BloquesDCondigo;
/*=====================================BLOQUES ESTATICOS EN JAVA=========================
 * Sirbe para incializar las variables estaticas de nuestro codigo
 * Es similar al bloque de codigo anonimo, solo que esta ocacion se pone la palabra
 * static antes de la primera llave {
 * 
 * */
public class BloquesEstaticos {

	private final int idPersona;
	private static int contadorPersonas;

	static { //Se debe anteponer la palabra static, esto hara que solo podamos usar variables estaticas o metodos estaticos
		System.out.println("Ejecuta el bloque estatico");
		
		contadorPersonas = 10;  		//sirbe para inicializar las variables estaticas en un lugar diferente de nuestro codigo
	}
	{
		System.out.println("Ejecuta el bloque inicializador");
		idPersona = ++contadorPersonas;
	}
	BloquesEstaticos (){
		System.out.println("Ejecuta el constructor");
	}
	public int  getIdPersona() {
		return idPersona;
	}
}

