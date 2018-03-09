package Clase133Excepciones;
import domain.*;
public class ManejoExceptionsArg {

	public static void main(String args[]) throws OperationException{
		
		try {
			int op1 = Integer.parseInt(args[0]);
			int op2 =Integer.parseInt(args[1]);
			
			Division dive = new Division(op1,op2);
			
			dive.visualizarOperacion();
		}catch (ArrayIndexOutOfBoundsException aie){
			 System.out.println("A ocurrio un erro csmr");
			 System.out.println("Elemento fuera de rango");
			aie.printStackTrace();
		}catch (NumberFormatException nfe) {
			 System.out.println("A ocurrio un erro csmr");
			 System.out.println("Uno de los argumentos no es entero");
			 nfe.printStackTrace();
		}catch (OperationException oe) {
			 System.out.println("A ocurrio un erro csmr");
			 System.out.println("Error en la operacion, un numero es cero");
			 oe.printStackTrace();
		}finally {
			System.out.println("Se terminaron de revisar las exepciones madafakkkkkka");
		}
	}
}
