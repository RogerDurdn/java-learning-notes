package Clase133Excepciones;
/*=========================================================================================	EXCEPCIONES EN JAVA ===============================================
 * Es una cituacion no esperada en la ejecucion de un programa, por ejemplo "si un argumento es valido o no", "si una conversion de tipo de dato es incompatible", o "si existe
 * una  falla a una base de datos" entre muchas mas.
 * 
 *  Existen bastantes excepciones ya creadas en el API de java par aresolverlos, pero si no existe, podemos crear nuestras clases de excepcion.
 *  
 *  Tipos y utilizacion:
 *  checkExceptios y uncheckEceptions
 *  
 *  checkExceptios: Heredan de la clase Exception de java.
 *  				Este tipo de exep se da cuando el programa arroja un aviso de que se tiene que realizar una actividad.
 *  		Ejemplo: SQLException, que deciende de la clase Exception y es arrojada cuando existe algun problema con el uso de base de datos 
 *  
 *  uncheckEceptions: Heredan de la clase RuntimeExeption.
 *  				Este tipo de exep no se deben de procesar obligatoriamente, por lo que es opcional el uso del bloque try y catch, o indicarlo en la declaracion del metodo.
 *  				Este tipo de exep tambien se les conoce como exep en tiempo de ejecucion 
 *  		Ejrmplo: NullPointerException, 
 *  
 *  NOTA+: Existe polemica sobre cual de las exception utilizar y la estratejia de como manejarlas, sin embargo ultimamente se usan mas las exep uncheckException ya que son mas permisibas, 
 *  al momento de procesar la exep 
 *  Un grupo de trabajo que utilizo este tipo de exep, fue el que desarrollo el framework Spring.
 *  
 *  SINTAXIS==================================================================
 *  sintaxis general, para el manejo de exep:
 *  
 *  public void verificaExepciones(){
 *  	try {
 *  			//Codigo que lanza exepciones
 *  
 *  	} catch (Exception ex) {
 *  			//Bloque de codigo que maneja la expecion
 *  
 *  		ex.printStackTrace();
 *
 *  		}
 *  
 *  	finally{
 *  		//Bloque de codigo opciona, pero que se ejecuta siempre
 *  	}
 *  }
 * -Pueden ser varios bloques catch los que procesan las exepciones, dentro del bloque pueden ser distintos tipos de exepcion.
 * 
 * -Orde [Cuando se procesan las exepciones en el bloque catch, comienzan a procesarce dependiendo de la gerarquia, siendo la mas baja (gerarquicamente) la primera en procesarce,
 * continuando con el procesamiento gerarquicamente acendente.
 * 
 * -El bloque try-catch es opcional para la implementacion de las exepciones uncheck(las que decienden de runtimeException)  
 * 
 *  Ejemplo: Podria ser el querer acceder a un elemento que se encuentra fuera del rango, lo que nos arrojaria una expcion de tipo arrayAoutAboundException.
 * */
public class Excepciones {

}
