
package Clase102ForEachArgVar;
/*============================================================FOREACH ARGUMENTOS VARIABLES=========================
 * Este metodo simplifica la iteracion entre arreglos o conexiones,
 * */
public class ForEachArgVar {
	public static void main(String[] args) {
		
		imprimirNumerosForEach(12,13,11,51,23,60);
		
	}
	public static void imprimirNumerosForEach(int...numeros) {
		//int contador=0;
		for(int numero : numeros) { 							//se declara la variable (numero)que va acontener el valor de cada elemento del arreglo(numeros)
																//este metono no sirbe para saber en que indice se encuentra cada elemento dentro del arreglo, si no hasta que se 
			System.out.println(" tiene el numero: "+numero);		//cree un contador
		}
	}

}
