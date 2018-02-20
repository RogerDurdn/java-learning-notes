package Clase106BloquesDCondigo;
/*======================================================BLOQUES DE CODIGO INICIALIZADORES==============================================
 * Un bloque de codigo es practicamente cualquier parte del codigo que inicie con una llave y termine con una llave {kfdjhfjh fgsdjhfgjdsh}
 * Cualquier contenido en estas llaves se conoce como un bloque de codigo 
 * 
 *Sin embargo se conocen bloques de codigo anonimo: Nos permiten comunmente inicializar variables de la clase 
 *Estos bloques llamados inicializadores pueden iniciar dos tipos de variables . De instancia o de tipo static 
 *
 *Para declarar un bloque dee tipo anonimo e inicializar variables de instancia Ejemplo:
 *
 *{//aqui se inicializa el bloque
 *System.out.println("Ejecuta bloque inicializador");
 *
 *idPersona = ++contadorPersonas;
 * }//aqui se termina
 * 
 * El objetivo de este bloque es que se ejecute antes de la inicializacion de nuestro constructor
 * De hecho este bloque se codigo se copia en cada constructor y se ejecuta antes de la ejecucion del constructor 
 * 
 * En la salida veriamos: Ejecuta bloque inicializador
 * 						  Ejecuta Constructor
 * 						  id Persona: 1
 * NOTA: primero se crean las variables estaticas y despues las dinamicas(o atributos de la clase)
 * */

public class BloqueDeCodigo {
	
	private final int idPersona;
	
	private  static int contadorPersona;
	
		{
		
			System.out.println("Bloque inicializador");
			idPersona = ++contadorPersona;
	
		}
	BloqueDeCodigo(){
		System.out.println("Ejecuta constructor");
	}
	public int getIdPersona() {
		return idPersona;
	}
}
