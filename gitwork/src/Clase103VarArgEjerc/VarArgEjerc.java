package Clase103VarArgEjerc;

public class VarArgEjerc {

	public static void main(String[] args) {
		
		varNumeros(5,13,32,14,11);
		varElementos(11,65,78,45);
		varGeneral("Roger",false,13,23,42,13);
		
	}
	public static void varNumeros(int...numero) {
		for(int numeros : numero) {
		System.out.println("El numero es:"+numeros);
		
		}
		System.out.println("");
	}
	
	public static void varElementos(int... elemento) {
		int contador=0;
		for (int elementos : elemento) {
		
		System.out.println("El elemento "+contador+" es:"+elementos);
		contador++;
		}
		System.out.println("");
	}
	public static void varGeneral(String nombre, boolean val, int... numero) {
		System.out.println("nombre:"+nombre);
		System.out.println("validacion:"+val);
		
		for(int numeros : numero) {
			System.out.println("el numero es:"+numeros);
		}
		
	}
}
