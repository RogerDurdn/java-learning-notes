package Clase117Polimorfismo;
import Clase115SobreEsrcMetodosOverrididing.*;
/*================================SUPER E INVOCACION DE METODOS SOBRE ESCRITOS====================================================
 * Una subclase puede invocar un metodo de la clase padre por medio de la palabra reservada super
 * 
 * Ejemplo:
 * 	* public String obtenerDetalles(){
 * 		return nombre+puesto+nivel;
 * 	}
 * 
 * en la clase Gerente:
 * 
 * @Override
 * public String obtenerDealles(){					//esta mal por que no hace uso de la palabra super
 * 		return nombre+puesto+nivel+departamento;
 * 	}
 * 
 * public String obtenerDetalles(){
 * 		return super.obtenerDetalles()+departamento; //asi es como se debe de hacer
 * 
 * La palabra super es como el operador this pero esta hace referencia a la clase padre, puede referenciar a atributos, constructores o metodos de la clase padre
 * 
 * Una de la ventajas de usar super, es la reutilizacion de codigo, en lugar de escribir todo de nuevo, con la palabra super se hace referencia de lo que se va 
 * a reutilizar, 
 * 
 * -----Para aplicar el concepto de polimorfismo es necesario apoyarnos de una jerarquia de clases, y utilizar un tipo de datos que pueda almacenar referencia de
 * objetos en la jerarquia de clases deseada. 
 * */
public class SuperEInvocacionDMetodsSobreexcrtos {
	
	public static void main(String[] args) {
		
		Empleado emp = new Empleado("lopez",1000); //se crea un objeto de tipo empleado
		
		imprimirDetalles(emp);						//se utiliza el metodo static para usar el metodo obtener detalles
		
		System.out.println("");
		Gerente ger = new Gerente("Almeida",2500,"ventas"); //se crea un objeto de tipo Gerente(subclase de la clase empleado)
		
		imprimirDetalles(ger);						//aunque el metodo aya sido creado con argumento de Clase Empleado, por ser gerente una subclase, puede hacer uso del metodo
													//la diferencia recae en el argumento que se da, aqui es donde se hace el poliformismo.
	}
	public static void imprimirDetalles(Empleado emp) { //se crea un metodo static para llamar almetodo de la clase empleado(padre)
		
		System.out.println(emp.obtenerDetalles());
	}
	/*
public static void imprimirDetalles(Gerente emp) { //se crea un metodo static para llamar almetodo de la clase empleado(padre)
		
		System.out.println(emp.obtenerDetalles()); //no se puede aplicar de la subclase a la clase padre,
	}*/

}
