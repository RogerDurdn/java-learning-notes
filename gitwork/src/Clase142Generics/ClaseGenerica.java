package Clase142Generics;

public class ClaseGenerica<T> {
	
	T objeto;
	
	public ClaseGenerica(T objeto) {
		this.objeto = objeto;
	}
	public void oTipo() {
		System.out.println("El tipo de dato es: "+objeto.getClass().getName());
	}
}
