package paquete2;
import paquete1.Clase1;
public class Clase3 extends Clase1 {

	public Clase3() {
		//Constructor protegido, al ser una subclase puede acceder aunque este en otro paquete
		super(1,2);
		//Acceso al pakete y al estar fuera del paquete esta restringido
		//super(1,2,3);
		//Acceso al privado, restringido
		//super(1,2,3,4);
	}
	public void pruebaDeClase3() {
		
		Clase1 c1 = new Clase1();
		
		System.out.println("");
		System.out.println("Atributo publico:"+c1.atrPublico+" o heredado"+atrPublico);
		System.out.println("Atributo protected heredado"+atrProtegido);
		System.out.println("Atributo paquete , no se puede acceder de un paquete externo");
		System.out.println("Atributo privado acceso denegado");
		
		
		//Constructor Publico
		new Clase1();
		//Los demas constructores no se pueden probar asi, si no desde el constructor de esta clase
		//Ya que esta es una cubclase en otro paquete
		
		System.out.println("");
		
		System.out.println("Metodo publico:"+c1.metodoPublico());
		System.out.println("Metodo protegido Heredado:"+metodoProtected());
		System.out.println("Metodo paquete no se puede acceder desde un paquete externo");
		System.out.println("Metodo privado accesp denegado");
		
		
		


	}
}
