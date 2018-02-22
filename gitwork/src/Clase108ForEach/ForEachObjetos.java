package Clase108ForEach;
/*Es recomendable cuando se quiere recorrer un arreglo o coleccion en su totalidad, Pero si se quiere tener un control mas preciso
 * Y Por ejemplo detener la ejecucion del ciclo cuando este en un elemnto o un indice en concreto, es recomendable usar el 
 * ciclo for normal o incluso un ciclo while o do while dependiendo del caso.
 * */
public class ForEachObjetos {

	public static void main(String[] args) {
		
		Persona [] personas = {new Persona("Juan"),new Persona("Pedro"),new Persona("Luis")};
		
		for(Persona p1: personas) {																//con esta sintaxis debemos de indicar que queremos del objeto
			System.out.println("La persona es: "+p1.getNombre());							   //ya que si no usamos un metodo solo nos regresa la referencia en memoria
		}
	}
}
