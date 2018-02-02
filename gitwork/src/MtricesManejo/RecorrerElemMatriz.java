package MtricesManejo;
/*=================================RECORRER ELEMENTOS DE UNA MATRIZ=======================================
 * 
 * */
public class RecorrerElemMatriz {
	
	public static void main(String[] args) {
		
		int [][] numeros;
		
		numeros = new int[3][2];
		
		numeros [0][0] = 3; 
		numeros [0][1] = 5;
		numeros [1][0] = 7;
		numeros [1][1] = 1;
		numeros [2][0] = 8;
		numeros [2][1] = 9;
		
		System.out.println("El valor del indice 0-0 es: "+numeros[0][0]);
		System.out.println("El valor del indice 1-0 es: "+numeros[0][1]);
		System.out.println("El valor del indice 0-1 es: "+numeros[1][0]);
		System.out.println("El valor del indice 1-1 es: "+numeros[1][1]);
		System.out.println("El valor del indice 2-0 es: "+numeros[2][0]);
		System.out.println("El valor del indice 2-1 es: "+numeros[2][1]);
	}
}
