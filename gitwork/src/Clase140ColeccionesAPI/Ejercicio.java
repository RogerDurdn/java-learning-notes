package Clase140ColeccionesAPI;
import java.util.*; 							//en esta libreria es donde se encuentra la api de java
public class Ejercicio {

	public static void main(String[] args) {
		
		List miLista = new ArrayList();			//creamos una variable de tipo interfase(List), haciendo referencia al objeto de tipo Array
													//no es necesario especificar el tamano de la lista, pues esta crecera dinamicamente
		miLista.add("1");					//con este metodo anadimos un nuevo elemento a la lista, 
		miLista.add("2");					//Nota: al no especificarce el tipo de dato, la lista por defecto se creara de tipo object 
		miLista.add("3");
		miLista.add("4");
		//se repite el elemento 4
		miLista.add("4");				// permite duplicar los elementos 
		
		imprimir(miLista);
	
	Set miSet = new HashSet();			//Se define una variable de tipo interface(Set) con el objeto Hashset
	miSet.add("100");
	miSet.add("200");
	miSet.add("300");
	//no permite elementos repetidos, por eso ignora el siguiente
	miSet.add("300");				//no permite duplicar los elementos 
	imprimir(miSet);
	
	Map miMap = new HashMap();		//se define una variable de tipo interface(Map) que hace referencia un objeto HashMap
	//Tiene la forma de Llave y valor
	miMap.put("1","Juan");
	miMap.put("2","claros");		//Primero se anade la llave y posteriormente el valor que conte
	miMap.put("3","pedro");			//al no definir los tipos de datos, los argumentos seran por default de tipo object
	miMap.put("4","ana");
	
	//Se imprimen todas las llaves
	imprimir(miMap.keySet());		//este metodo .keySet(), manda la coleccion de valores dentro del mapa definidos dentro de las key
	
	//Se imprimen los valores
	imprimir(miMap.values());	//este metodo .vaules(), manda una lista de los valores.
	
	}
	private static void imprimir(Collection collection) {	//El tipo de dato es de tipo interface(Collection) la cual es la principal del api de java
		//Por lo que puede apuntar a todos los objetos de los tipos de las interfaces que heredan de ella.
		
		for (Object elemento: collection) {						//se utiliza un for each para recorrer cada implementacion, para el for each se crea una variable 
				System.out.print(elemento+" ");					//de tipo object, ya que en la colecciones no se especifica el tipo de dato,
		}													//se usa collecion, para hacer referencia a las colecciones(ya que todas las interfaces utilizadas son hijas de 
		System.out.println("");							//la interface collection),
	}													//por ultimo se imprime cada elemento de la coleccion resivida.
	
}
