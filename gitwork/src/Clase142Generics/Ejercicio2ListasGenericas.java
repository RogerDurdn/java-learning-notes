package Clase142Generics;
import java.util.*;
public class Ejercicio2ListasGenericas {

	public static void main(String args[]) {
		
		List<Integer> misNumeros = new ArrayList<>();
		
		misNumeros.add(2);
		misNumeros.add(3);
		misNumeros.add(4);
		misNumeros.add(5);
		misNumeros.add(5);
		
		imprimir(misNumeros);
		
		
		Set<String> palabras = new HashSet<>();
		
		palabras.add("hola");
		palabras.add("dolar");
		palabras.add("hello");
		palabras.add("coco");
		palabras.add("picfo");
		
		imprimir(palabras);
		
		
		Map<Integer,String> direccion = new HashMap<>();
		
		direccion.put(1, "loro");
		direccion.put(2, "gato");
		direccion.put(3, "pollo");
		direccion.put(4, "agua");
		direccion.put(5, "perro");
		
		imprimir(direccion.keySet());
		imprimir(direccion.values());
	}
	public static void imprimir(Collection coleccion) {			//de esta manera podemos utilizar todos los tipos de datos al mismo tiempo
		
		for(Object elemento: coleccion) {
			System.out.print(elemento+" ");
		}
		System.out.println(" ");
	}
	/*public static void imprimir(Collection<String> coleccion) {
		for(String elemento: coleccion) {
			System.out.print(elemento+" ");							Aqui hacemos el metodo directamente para el tipo de dato 
		}															Por lo tanto no hay necesidad de hacer un cast "Object elemento"
		System.out.println("");										El problema es que solo se puede aplicar a un dato en concreto,
	}*/
}
