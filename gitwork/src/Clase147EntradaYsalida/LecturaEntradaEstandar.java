package Clase147EntradaYsalida;
import java.io.*;
/*====================================================== LECTURA DE ENTRADA ESTANDAR EN JAVA ======================================
 *
 * */
public class LecturaEntradaEstandar {
	
	public static void main(String[] args) {
		
		String captura;
		
		InputStreamReader entrada = new InputStreamReader(System.in); //creamos un objeto de tipo InpoutStream (solo toma 1 caracter de entrada
	
		BufferedReader bEntrada = new BufferedReader(entrada);		//Al crear un objeto buffer se pueden tomar mas datos de la entrada input
		
		try {													//acemos un try catch para ver si hay erroes
			System.out.println("Introduce un dato jolipollas!!");
			
			captura = bEntrada.readLine();						//igualamos la entrada a la variabel captura String
			
			while(captura != null) {
				System.out.println("Dato introducido: "+captura);	// mientras la captura sea diferente de null
				captura = bEntrada.readLine();
			}
		}catch (IOException e) { //se procesa la exepcion de IO Input Output 
			e.getStackTrace(); // para localizar la locacion del error que pudiera haber.
		}
	}
}
