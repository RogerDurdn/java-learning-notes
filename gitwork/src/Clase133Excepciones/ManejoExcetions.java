package Clase133Excepciones;
import domain.*;
/*Algunas exceptions mas comunes en java,
 * Ejercicion.
 * */
public class ManejoExcetions {
	
	public static void main(String[] args) {
		
		try {
			Division division = new Division(10,0);
			division.visualizarOperacion();
		}catch (OperationException oe){
			System.out.println("Ah ocurrido un error, jolines, tio!!");
			oe.printStackTrace();
		}
	}
}
