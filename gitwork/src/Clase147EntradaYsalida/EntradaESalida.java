package Clase147EntradaYsalida;
/*=========================================================== ENTRADA Y SALIDA =====================================
 * Es la capacidad de introducir datos y mostrarlos en la consola.
 * 
 * Para interactuar con la consola (tambien conocidas como flujos de entrada o salida estandar), del sistema operativo existen 3 variantes:
 *
 * System.in :Le de la entrada estandar y es de un tipo input stream/por ejemplo leer datos del teclado 
 * 
 * System.out :Escribe la salida estandar y es de tipo  print stream/ por ejemplo, mostrar datos en la pantalla
 * 
 * System.er :Escribe a la salida estandar de errores es de tipo print stream/ por ejemplo muestra datos de error en la pantalla 
 * 
 * Estas son algunas de las variantes que podemos utilizar para recibir y enviar informacion a la salida estandar.
 * ]
 * ========================DIFERENCIAS ENTRE FLUJOS BYTE Y CHAR
 * -Tiene que ver directamente con el tipo de dato que estemos utilizando 
 * 
 * 							Caracteres																		Bytes
 * 			Programa <---------- Flujo(BufferedInputStream)<------- isr(InputStreamReader)<-------------in(PrintStream)<----------------teclado
 *
 *Bytes:
 *		-Los flujos o streams, son utilizados para procesar un byte a la vez 
 * 		-Son recomendados para procesar archivos binarios (word, exel, pdf o cualquier formato que es mas complejo que un simple archivo de texto ) 
 * 
 * Caracter:
 * 			-Las clases que son de reader o writer son utilizadas para procesar un caracter a la vez.
 * 			-So recomendadas para procsar texto basado en algun juego de caracteres, como es el cofigo aski o unicode, 
 * 
 * Las clases que tienen Buffer:
 * 			-Son utilizadas para procesar mas de un caracter o byte a la vez 
 * */
public class EntradaESalida {

}
