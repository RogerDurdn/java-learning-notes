package Clase147EntradaYsalida;
import java.util.*;
public class ClaseEscanner {

	public static void main(String[] args) {
		
		String lectura=null;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un dato:");
		
		lectura = entrada.nextLine();
		
		while(lectura != null) {
			System.out.println("El dato que introdujo es:"+lectura);
			lectura = entrada.nextLine();
		}
	}
}
