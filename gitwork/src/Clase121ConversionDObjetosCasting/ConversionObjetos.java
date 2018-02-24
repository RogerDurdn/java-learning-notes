package Clase121ConversionDObjetosCasting;
/*=======================================================CONVERSION DE OBJESTOS (CASTING)====================================================
 * Conversion del tipo de una variable que apunta a un objeto
 * Se hace con el objetivo de ejecutar cierto codigo o generalizar nuestro codigo y asi soportar multiples operaciones para multiples tipos 
 * de datos, desde una misma funcion generalizada
 * -Nos permite reutilizar codigo y engeneral es una buena practica de porgramacion 
 * Si se hace una conversion a un tipo mas especifico, es decir un tipo inferior en la gerarquia de clases 
 * 
 *  De un tipo inferior a ---> tipo Superiro = Upcasting Es decir conversion hacia arriba.
 *  De un tipo Superior a ---> tipo inferior = Downcasting
 * 
 * 							Object						
 * 							  |
 * 							  |Extends
 * 							  |
 * 							Empleado				
 * 		^Upcasting			  |											|
 * 		|					  |											|
 * 		|					  |Extends									|
 * 		|		--------------------------------						^ Downcasting
 * 				|				|				|
 * 				|				|				|		
 * 				|				|				|
 * 			Editor			Gerente 		Escritor		
 * 												|
 * 												|Extends
 * 												|
 * 											Corrector	
 * 
 * Esto es muy frecuente en java
 * 
 * UPCASTING: Se realiza de manera automatica y no hay necesidad de escribir algun codigo de manera explicita, debido a que si es un tipo superior 
 * en automatico se realiza la conversion, esto es similar a los tipos primitivos en java y la conversion entre ellos 
 * 
 * DOWNCASTING: No se realiza de manera automatica 	y es necesario especificar cual es el tipo al que queremos convertir y cuando se realiza de 
 * manera erronea mandara el mensaje de error: Class cast exeption.
 * 	Para realizar un downcasting solo debemos de especificar el tipo al cual deseamos convertir entre parentesis Ejemplo:
 * 		Escritor(Corrector); y con ello tendremos un tipo de dato que ya incluye todas las caracteristicas del tipo mas especifico recien 
 * 								convertido.
 * */
public class ConversionObjetos {

	public static void main(String[] args) {
		
		
		
		//Empleado emp = new Escritor("kumo",20000,"Index"); 		//se crea un objeto de tipo escritor, el cual nunca cambia de tipo, esta referencia es asignada a una
																//variable de tipo empleado(mayor gerarquia),esto es lo que seria el Upcasting
														//al hacer el upcasting ya no se puede acceder a los metodos de la clase escritos, solamente a los de la clase
														//empleado por haber hecho el upcasting
		//emp.getTipoEscritura();    					//no es posible ya que no se puede acceder, porque ahora es de mayor gerarquia
		
		//Sintaxis para hacer Downcasting en una variable de un tipo gerarquicamente mayor
		
		//Escritor escritor = (Escritor) emp; 			//Downcasting, se crea una nueva variable para pasar la conversion,
		
		//Esta es la manera en que podemos acceder a el metodo de la clase inferior
		//resultado = escritor.getTipoEscritura();		//con la nueva variable se puede acceder a los metodos de la clase inferior
		
		//resultado = ((Escritor)emp).getTipoEscritura(); //Con esta sintaxis nos ahorramos la variable y lo convertimos en conjunto
		//Con esta sintaxis ponemos entre los ((La clase deseada"subclase")y la variable a convertir"de la clase padre"),despues llamamos al metodo
		//System.out.println("resultado de tipo:"+resultado);
		
		//NOtA: Si es un upcasting, no hay necesidad de especificar el tipo de clase a convertir ya que el compilador detectara que la clase es de mayor gerarquia y se hara una
		//conversion en automatico
		
		
	}
}
