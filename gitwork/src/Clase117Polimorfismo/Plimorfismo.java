package Clase117Polimorfismo;
import Clase115SobreEsrcMetodosOverrididing.*;
/*================================================POLIMORFISMO EN JAVA===================================================================================
 * Es la habilidad de ejecutar metodos sintacticamente iguales en tipos distintos 
 * Ejemplo:
 * 			Empleado emp = new Empleado("Juan",1000);
 * 	    1 	emp.obtenerDetalles();
 *
 *		2	emp = new Gerente("Karla",2000,"ventas");
 *			emp.obtenerDetalles(); 
 *
 *En #1, tenemos que se crea un objeto de la clase Empleado(padre) al cual se le asigna la referencia en memoria a la variable emp,
 *acto seguido usamos el metodo mostrarDetalles(); lo que nos regresara los valores de la clase Empleado.
 *
 *En #2, tenemos que se utiliza la variable "emp" anteriormente usada para la clase Empleado, pero ahora con esta misma se creara una
 *refrerencia a la clase Gerente, acto seguido se manda a llamar al metodo de la clase Gerente que es una sobreescritura del metodo
 *de la clase Empleado, lo cual nos dara los valores de la clase Gerente.
 *
 *El metodo se ejecuta, En el momento de EJECUCION, del tipo que este en el.
 *Cuando esta en ejecucion el tipo Empleado, se ejecuta el metodo para el tipo empleado
 *Cuando esta en ejecucion el tipo Gerente. se ejecuta el metodo para el tipo Gerente
 *
 *NOTA:Solo se puede hacer poliformismo cuando son subclases, y tienen los mismo metodos, ya que si son de tipos distintos no.
 *									------------TIEMPO DE EJECUCION-----------------------
 *
 * */
public class Plimorfismo {
	
	public static void main(String[] args) {
		
		Empleado emp = new Empleado("pepe",2000);	//se crea un objeto de la clase empleado con la variable emp
		System.out.println(emp.obtenerDetalles());	//se usa el emetodo para saber cuales son sus detalles
		
		System.out.println("");
		emp = new Gerente("Laura",3000,"ventas");	//se usa la variable de tipo Empleado para hacer una de tipo gerente
		System.out.println(emp.obtenerDetalles());	//se usa el metodo para saber cuales son sus detalles
	}

}
