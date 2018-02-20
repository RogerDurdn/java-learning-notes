package Clase104Enumeracion;
/*=============================================VALORES DE UNA ENUMERACION======================================
 * ES un metodo disponible llamado "values" que nos permite recuperar todos los valores asociados a una enumeracion 
 * Este metodo se agrega por default cada que creamos una enumeracion.
 * El objetivo de este metodo es regresar una lista de cada una de las constantes definidas en una enumeracion 
 * 
 * 
 * Ejemplo:
 * */
public class ValoresEnumeracion {
	
	public static void main(String[] args) {
		
		System.out.println("");
		imprimirContinentes();
	}
	
	public static void imprimirContinentes(){
		for(AtributosYmetodos c: AtributosYmetodos.values()) {							//se utiliza un for each para asociar la numeracion a una variable definina en este caso c
																						//Se utiliza el .values para definir que se usaran los valores de la enumeracion
			System.out.println("Continente "+c+" contiene "+c.getPaises()+" paises");	//por lo anterior aqui podemos usas el metodo .getPaises() en la variable "c"
		}
	}
}
