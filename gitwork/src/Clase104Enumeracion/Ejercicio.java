package Clase104Enumeracion;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		System.out.println("El elemento 1 es "+AtributosYmetodos.AFRICA);
		System.out.println("El elemento 2 es "+AtributosYmetodos.AMERICA);
		System.out.println("El elemento 3 es "+AtributosYmetodos.ASIA);
		
		System.out.println("");
		imprimirElemento(AtributosYmetodos.AMERICA);
		System.out.println("");
		
		imprimirNumeros();
		
		System.out.println("");
		imprimirDias();
	}
	
	public static void imprimirNumeros() {
		int contador=0;
		for(AtributosYmetodos elemento : AtributosYmetodos.values()) {
			
			System.out.println("El continente: "+contador+++" es "+elemento+" Tiene: "+elemento.getPaises()+" paises.");
		}
	}
	public static void imprimirElemento(AtributosYmetodos continente) {
		
		System.out.println(continente.getPaises()+" paises");
	}
	public static void imprimirDias() {
		int contador=1;
		for(Enumeraciones d: Enumeraciones.values()) {
			System.out.println("El dia "+contador+++" es:"+d);
		}
	}
}
