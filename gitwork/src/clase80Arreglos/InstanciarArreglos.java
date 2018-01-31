package clase80Arreglos;
/*=======================================================INSTANCIAR ARREGLOS===============================
 * Sintaxis para instanciar un arreglo de una dimencion--  nombreArreglo = new tipo[largo];
 * Es importante anotar el numero de elementos que se utilizaran en el array [5] tomando en cuenta
 * que el indice comienza en "0	"
 * */
public class InstanciarArreglos {
	public static void main(String[] args) {
		
		//para instanciar arreglos de tipo primitivo 
		int [] enteros;
		boolean [] banderas;
		
		enteros = new int[5];
		banderas = new boolean[7];
		
		//para instanciar arreglos de tipo object
				Persona personas [];
				String [] nombres;
		personas = new Persona[5];
		nombres = new String[10];
	}
}
class Persona {
	static String nombre;
}
class Nombre{
	static String nombre;
}
