package Clase110AUTOBOXINGuNBOXIN;
/*=======================================================================AUTOBOXIN-UNBOXING==============================================================
 * 
 * AUTOBOXING:
 * 				Es el proceso en el cual el compilador hace de manera automatica una conversion de un tipo primitivo a un tipo object 
 * 		Ejemplo:
 * 				Integer eneteroObj = 10;
 * 				Float	floatObj = 15.2F;
 * 				Double doubleObj = 40.1;
 * *NOTA:Existe un tipo de clase envolvente por cada tipo primitivo
 * Integer: se conoce del tipo envolvente o wrapper de tipo primitivo int y es la que permite el proceso de conversion de manera automatica
 * 			entre tipos primitivos y onjeto de tipo entero 
 * El proceso de autoboxing no requiere de hacer ningun tipo de conversion entre tipos primitivos y tipos object, siempre y cuando utilicemos el tipo 
 * envolvente equivalente al tipo primitivo que se esta intentando vonvertir de manera utomatica 
 * 
 * [Al hacer la conversion(AUTOBOXIN) se le puede tratar como un objeto]
 * 
 * 
 * UNBOXING:
 * 
 * 			Un objeto de tipo envolvente se puede convertir a uno de tipo primitivo sin necesidad de aplicar ninguna conversion entre tipos, objetos y
 * 			tipos primitivos:
 * 		Ejemplo:
 * 		
 * 			int entero = enteroObj;
 * 			float flotante = floatObj;
 * 			double doble = doubleObj;
 * 
 * *NOTA: Es necesario indicar un cast para indicar que vamos a realizar una conversion entre objetos*(PROCESO DE CONVERSION DE OBJETOS) AQUI NO!!
 * 
 * 
 * 								Tipo Primitivo				Clase Envolvente
 * 								boolean						Boolean
 * 								byte                        Byte
 * 							 	char						Character
 * 								float						Float
 * 								int 						Integer
 * 								long						Long
 * 								short						Short
 * 								double						Double
 * NOTA!!!!:Las clases envolventes decienden de una clase llamada "Number" la cual dota de metodos para realizar la conversion,
 * Sin importar de que tipo de dato se trate podemos solicitar el valor correspondiente a un primitivo de tipo byte,short,int,long,float o double
 * Des esta manera podremos convertir el dato contenido por la clase envolvente a cualquiera de los tipos mencionados
 * 
 * El concepto de AUTOBOXING y UMBOXING, permite escribir codigo mas simple, cuando hablamos de conversiones, esto se comenzo a usar antes de la version 5 de 
 * Java 
 * */
public class AUTOBOXINGunboxing {
	

}
