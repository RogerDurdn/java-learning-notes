package Clase142Generics;

public class Ejercicio1 {
	
	public static void main(String[] args) {
	ClaseGenerica<Integer> numero = new ClaseGenerica<Integer>(10);
	
	numero.oTipo();
	
	ClaseGenerica<String> frase = new ClaseGenerica<>("Hola");
											//		|           No es necesario poner de nuevo el tipo en los <> ya que se infiere por haberlo usado al momento de declarar
	frase.oTipo();
	
	// ClaseGenerica<int> primitivo = ClaseGenerica<int>(2); marca error ya que no se puede aplicar a los valores primitivos
	}
}
