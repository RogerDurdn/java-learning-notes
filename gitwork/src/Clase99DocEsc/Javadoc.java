package Clase99DocEsc;
/*=============================================================JAVADOC=======================================
 * JavaDoc: Es un documento html que muestra la documentacion de las clases en java
 * la sintaxis para realizar el dcomentario en javadoc es /** y termina con *\ de esta amnera se documenta 
 * la clase. atributos etc. 
 * Como documentar un proyecto en java
 * */
/**
 *
 * @author Durden
 * @version: 1.0
 */
public class Javadoc {
	/**
	 * primer operando 
	 */
	int operandoA;
	/**
	 * Segundo operando
	 */
	int operandoB;
	/**
	 * Constructor de la clase vacio
	 */
	public Javadoc () {
		
	}
	/**
	 * Este metodo realiza la suma de dos operandos enteros
	 * @return int resultado de la suma
	 */
	public int sumar() {
		
		return operandoA + operandoB;
	}
}
