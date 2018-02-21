package Clase108ForEach;
//Usamos la clase Persona ya creada
public class Ejercicio {
	
	public static void main(String[] args) {
		
		int [] numeros = {11,12,13,14,15};
		Persona [] personas = {new Persona("Juan"),new Persona("pepe"),new Persona("dan"),new Persona("kilo")};
		
		
		
		for(Persona p: personas) {
			
			System.out.println("La persona es:"+p.getNombre());
		}
		for(int n: numeros) {
			System.out.println("El numero es:"+n);
		}
	
	
	}
}
