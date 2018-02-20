package Clase104Enumeracion;

public class EnumeracionConAtributosYmetodos {

	public static void main(String[] args) {
		System.out.println("Continente no.4:"+AtributosYmetodos.AMERICA);				//Solo llamamos al numerador 
		System.out.println("Paises en America:"+AtributosYmetodos.AMERICA.getPaises()); //imprimimos el numerador con la llamada a su metod que nos da el numero
		
		System.out.println("");
		indicarPaises(AtributosYmetodos.AFRICA);						//se llama directamente al metodo, se debe hacer uso del nombre de la numeracion e indicar uno de sus numeradores
	}
	public static void indicarPaises (AtributosYmetodos continentes) { //se crea un metodo con la numeracion 
		
		switch (continentes){ 											//se crea un switch con la variable del argumento
			
		case AFRICA: 
			System.out.println("No.Paises en: "+continentes+":"+continentes.getPaises()); //en este case ponemos en uso el metodo hecho en la numeracion
		}
	}
}
