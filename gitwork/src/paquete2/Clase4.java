package paquete2;
import paquete1.Clase1;
public class Clase4 {
	//constructor publico
	public Clase4() {
		/*
		 * Constructor protegido, negado al no ser una subclase
		 * super(1,2)
		 * Constructor paquete negado al no estar en el mismo paquete
		 * super(1,2,3)
		 * Constructor privado acceso negado
		 * super(1,2,3,4)
		 * */
		
	}
	public void pruebaDeClase4(){
		//Acceso a clase 1 desde clase 4
		//Clase 4 NO es subclase y esta en otro paquete
		
		Clase1 c1 = new Clase1();
		
		System.out.println("");
		System.out.println("Atributo publico:"+c1.atrPublico);
		System.out.println("Atributo protegido No se puede acceder desde  una clase que no es subclase");
		System.out.println("Atributo paquete, No se puede acceder desde un paquete externo");
		System.out.println("Atributo privado, Acceso Denegado");
		
		//Constructor publico
		new Clase1();
		
		//Los demas constructores estan protegidos
		
		System.out.println("");
		System.out.println("Metodo publico:"+c1.metodoPublico());
		System.out.println("Metodo Protegido no se puede acceder porque no esta en una subclase");
		System.out.println("Metodo paquete no se puede acceder porque no esta en el mismo paquete");
		System.out.println("Metodo privado acceso denegado");
		
	}
}
