package Clase84ArreglosEjercicio;
import d.a.persona.Persona;
public class EjercicioArreglos {
	public static void main(String[] args) {
		
		int [] enteros = {4,3,4,5,6,7};
		//cuando son variables primitivas, no se usa la palabra new y solo se pone el valor que debe ser igual al valor del array.
		//ejemplo: enteros [0] = 10; 
		
		String nombres [];
		 nombres = new String [5];
		 
		 nombres [0] = new String("Juanes");
		 nombres [4] = new String("peps");
		 nombres [2] = new String("dods");
		 nombres [3] = new String("Juas");
		 nombres [1] = new String("nes");
		 
		 //Solo se puede crear un array con una clase cuando esta se importa con otro package, si la clase esta en el mismo paquete marca error
		 //ya que no se a instanciado la clase para ser usada en el array
		 Persona [] personas = {new Persona("aguacate"),new Persona("julia"), new Persona("Lupe","paca"),new Persona("Luis","Bunuel")};
		 int p=0;
		 
		for (int i=0 ; i <enteros.length;i++) {
			System.out.println("Lista de numeros indice:"+i+" es:"+enteros[i]);
			
		}
		
		System.out.println("");
		for (int n=0 ; n < nombres.length; n++) {
			System.out.println("Lista de nombres indice:"+n+" es: "+nombres[n]);
			
		}
		System.out.println("");
		while(p <personas.length ) {
			System.out.println("el indice de: "+p+" es: "+personas[p]);
			p++;
		}
}

}

