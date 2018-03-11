package Clase147EntradaYsalida;

public class Operaciones {

	private int a;
	private int b;
	
	public Operaciones(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void suma(int a, int b) {
		System.out.println("suma = "+(a+b));
	}
	public void multi(int a, int b) {
		System.out.println("multiplicacion = "+a*b);
	}
	public void resta(int a, int b) {
		System.out.println("resta = "+(a-b));
	}
	public void todos(int a, int b) {
		System.out.println("resta = "+(a-b));
		System.out.println("suma = "+(a+b));
		System.out.println("multi = "+(a*b));
	}
	
}
