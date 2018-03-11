package Clase147EntradaYsalida;
import java.util.*;
public class EjercicioCalculadora {

	public static void main(String args[]) {
		
		Scanner es = new Scanner(System.in);
		
		System.out.println("Que operacion quiere hacer? 1=suma, 2=resta, 3=multi, 4=todas");
		int c = es.nextInt();
		System.out.println("Introdusca un dos numeros ");
		
		int a = es.nextInt();
		int b = es.nextInt();
		
		Operaciones op = new Operaciones(a,b);
		
		switch (c) {
		case 1:
			op.suma(a, b);
		
		break;
		case 2:
			op.resta(a, b);
			
		break;
		case 3:
			op.multi(a, b);
		
		break;
		case 4:
			op.todos(a, b);
		break;
		default:
			System.out.println("nononono");
		}
	}
}