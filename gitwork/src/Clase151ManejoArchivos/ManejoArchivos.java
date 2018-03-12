package Clase151ManejoArchivos;
import java.io.*;
/*====================================================== MANEJO DE ARCHIVOS JAVA ==================================================
 * 
 * para escribir en un archivo tenemos que usar la clase FileWriter y la clase PrintWriter
 * */
public class ManejoArchivos {

	public static void main(String[] args) {
		File archivo = new File("c:\\prueba\\pruebaJava.txt");				//con la clase File creamos un archivo, 
													//La creacion del archivo debe de indicar la direccion de la carpeta que lo contenrda, dicha carpeta ya debe de existir
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));//para crear fisicamente el archivo necesitamos la clase FileWriter
																			//y la clase PrintWriter la cual creara el archivo ene l disco duro
			salida.close();
		}catch(IOException io) {
			io.printStackTrace();
		}
		System.out.println("El archivo se ha creado correctamente");
	}
}
