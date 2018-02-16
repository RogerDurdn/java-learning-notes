package Clase101ArgumentosVariablesJava;
/*==========================================================PARAMETROS VARIABLES===========================================
 * Agumentos variables:
 * 	Cuando queremos pasar variaps parametros del mismo tipo a una funcion.(se pueden pasar como un arreglo)
 * 	
 * De manera sencilla se pueden pasar con el concepto de "varargs"(argumentos variables)
 * 
 * 	
 * */
public class ArgumentosVariablesJava {
	public static void main(String[] args) {
		//Regla: los elementos que se envian, al final formaran un arreglo, por eso deben de ser del mismo tipo todos los elementos
		
		imprimirNumeros(2,12,33,11,23); //los valores de este arreglo (argumento variable), siempre deben de ser del mismo tipo
	}
	public static void imprimirNumeros(int...numeros) { //se utilizan los "..." para definir el argumento como variable int... y el nombre que se da"numeros" 
														//es el nombre del arreglo, se puede hacer de tipo Object
		int elemento;
			for( int i = 0; i < numeros.length; i++) {
				elemento = numeros[i];
				System.out.println("elemento: "+elemento);
			}
	}
}
