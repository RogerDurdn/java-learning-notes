package Clase137Excepciones2;
import exceptions.*;
public class Exceptions2Ejercicio {
	
	public static void main(String[] args) {
		
		AccesoDatos datos = new ImplementacionMySql();
		//cambiamos el estado a simularError = true
		datos.simularError(false);
		ejecutar(datos,"listar");
		
		System.out.println("");
		
		datos.simularError(true);
		ejecutar(datos,"insertar");
		
	}
	public static void ejecutar(AccesoDatos datos, String accion) {
		if("listar".equals(accion)) {
		try {	datos.listar();
			
			//si se van a procesar varias exepciones de la misma gerarquia, siempre se debe procesar la de menor jerarquia 
			//y posteriormente la de mayor gerarquia
		}
		catch(LecturaDatosEx ex) {
			System.out.println("Error lectura: Procesa  la exepcion mas especifica de la lectura");	
			}
		catch(AccesoDatosEx ex) {
			System.out.println("Error acceso datos: Procesa  la exepcion mas generica de acceso a datos");
			
			}
		catch(Exception ex) {
			System.out.println("Error general");
			}
		finally {
			System.out.println("Procesar finally es opcional, siempre se ejecutara si hubo error o no");
			}
		
		}
		else if("insertar".equals(accion)) {
			try {
				datos.insertar();
			}
				catch(AccesoDatosEx ex) {
					System.out.println("Error lectura: Podemos procesar solo la exepcion mas generica");	
					}
			finally {
				System.out.println("El uso de finally es opcional pero siempre se ejecuta, aya o no erroreswwwww");
			}
			}else {
			System.out.println("No se proporciono ninguna accion conocida");
		}
		
	}
}

