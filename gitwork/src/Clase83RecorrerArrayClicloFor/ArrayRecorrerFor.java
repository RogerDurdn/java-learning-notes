package Clase83RecorrerArrayClicloFor;
/*===================RECORRER UN ARRAY CON CICLO FOR==================================
 * 
 * */
public class ArrayRecorrerFor {
	
	public static void main(String[] args) {
		//Declaramos el array de la manera simplificada
		String[] nombres = {"pepe","puka","daniels","jimmy","coco"};
		//imprimimos los valores de la salida estandar
		System.out.print("");
		
		
		//Iteramos el arreglo de String con un for
		for(int i=0; i<nombres.length;i++) {
			//length toma la cantidad de elementos, en el indice, todo indice comienza desde el "0".
			System.out.println("El nombre del indice: "+i+", es: "+nombres[i]);
		}
	}
}
