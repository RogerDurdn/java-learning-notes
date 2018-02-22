package Clase111ModificadoresAcceso;
import paquete1.Clase2;
import paquete2.*;
public class ModificadoresAccesoEjercicio {
	
	public static void main(String[] args) {
		//Prueba de acceso de clase1 desde otras clases 
		//acceso a clase 1 desde clase 2
		System.out.println("***Acceso desde clase2 a clase1 (mismo paquete)***");
		
		new Clase2().pruevaDesdeClase2();
		
		//Clase 3 extiende de Clase1
		System.out.println("\nAcceso desde Clase3  a clase1 (diferente paquete pero es subclase)");
		
		new Clase3().pruebaDeClase3();
		
		
		//Acceso a clase 1 desde clase4
		//clase 4 no es subclase y esta en otro paquete
		
		System.out.println("\n!!!acceso a clase 1 desde clase4 (diferente paquete y no es subclase)");
		
		new Clase4().pruebaDeClase4();
	}
}
