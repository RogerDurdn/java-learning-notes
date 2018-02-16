package com.mg;
/**
 * 
 * @author Durden
 * @version: 1.0
 */
public class EjmJDoc {
/**
 * Primer operando
 */
	int operandoA;
/**
 *Segundo operando 
 */
	int operandoB;
/**
 * constructor vacion
 */
	public EjmJDoc() {
		
	}
/**
 * Constructor con parametros
 * @param a operando a
 * @param b operando b
 */
	public EjmJDoc(int a, int b) {
		this.operandoA = a;
		this.operandoB = b;
/**
 * Metodo que realiza la suma de dos operandos
 * @return int resultado de la suma
 */
	}
	public int sumaOperandos() {
	return operandoA + operandoB;
	}
}
