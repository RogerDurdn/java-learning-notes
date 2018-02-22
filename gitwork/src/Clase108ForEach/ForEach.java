package Clase108ForEach;
/*==================================================FOR EACH EN JAVA==============================================================================================
 * For each o For extendido: es una sintaxis resumida para iterar los elementos de un arreglo o coleccion des datos
 * 
 * Permite iterar facilmente los elementos de arreglo o coleccion
 * 
 * */
public class ForEach {
	
	public static void main(String[] arg) {
		
		int[] edades = {11,12,13,14,15};
		
		for(int edad: edades) { 						//se utilizan dos parametros, la variable y el arreglo o coleccion separados por dos puntos *la variable tiene que ser del tipo de dato
			
			System.out.println("La edad es de:"+edad);	//la variable "edad" en este momento es la que recive el valor del elemento de cada "for each" 
		}
	}
}
