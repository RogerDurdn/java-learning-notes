package Clase124ClaseObject;

public class EjercicioClaseObject {

	public static void mian(String[] args) {
		
		Empleado emp1 = new Empleado("Pepe",1000);
		Empleado emp2 = new Empleado("Pepe",1000);
		System.out.println("hola");
		compararObjetos(emp1,emp2);
	}
	public static void compararObjetos(Empleado emp1, Empleado emp2) {
		
		System.out.println("Contenido del objeto:"+emp1);
		
		if(emp1==emp2) {
			System.out.println("Los objetos tienen la misma direccion de memoria");
		}else {
			System.out.println("No tienen la misma direccion de memoria");
		}
		if(emp1.equals(emp2)) {
			System.out.println("Los objetos tienen los mismo atributos");
		}else {
			System.out.println("No tienen los mismos atributos");
		}
		if(emp1.hashCode()==emp2.hashCode()) {
			System.out.println("Los objetos tienen los mismos valores en sus atributos");
		}else {
			System.out.println("No tienen los mismo valores en sus atributos");
		}
	}
}
